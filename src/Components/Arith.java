package Components;

import org.objectweb.asm.Opcodes;
import symTable.Types;
import Compile.Compile;

public class Arith extends Op {

    public Expr expr1, expr2;

    public Arith(String s, Expr x1, Expr x2){
        super(s,null);
        expr1 = x1;
        expr2 = x2;
        type = Types.max(expr1.type, expr2.type);
        if (type == null) error("type error");
    }

    public void genJVM() {

        switch (op) {
            case "+":
                System.out.println("Arith + "+expr1.op+expr2.op);
                expr1.genJVM();
                expr2.genJVM();
                if (Types.Float.equals(type)) Compile.mv.visitInsn(Opcodes.FADD);
                else Compile.mv.visitInsn(Opcodes.IADD);
                break;
            case "-":
                expr1.genJVM();
                expr2.genJVM();
                if (Types.Float.equals(type)) Compile.mv.visitInsn(Opcodes.FSUB);
                else Compile.mv.visitInsn(Opcodes.ISUB);
                break;
            case "*":
                expr1.genJVM();
                expr2.genJVM();
                if (Types.Float.equals(type)) Compile.mv.visitInsn(Opcodes.FMUL);
                else Compile.mv.visitInsn(Opcodes.IMUL);
                break;
            case "/":
                Types t1 = expr1.type;
                Types t2 = expr2.type;
                expr1.genJVM();
                if (Types.Int.equals(t1)){
                    Compile.mv.visitInsn(Opcodes.I2F);
                }

                expr2.genJVM();
                if (Types.Int.equals(t2)){
                    Compile.mv.visitInsn(Opcodes.I2F);
                }
                //expr1.type = Types.Float;
                //expr2.type = Types.Float;
                Compile.mv.visitInsn(Opcodes.FDIV);
                break;
        }

    }
}
