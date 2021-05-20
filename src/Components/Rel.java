package Components;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import symTable.Types;
import Compile.Compile;

public class Rel extends Logical{

    public Rel (String s, Expr x1, Expr x2) { super (s, x1, x2);}

    public Types check(Types p1, Types p2){

        if (p1 == p2) return Types.Bool;
        else return null;

    }

    public void genJVM() {
        expr1.genJVM();
        expr2.genJVM();
        Label endLabel = new Label();
        Label trueLabel = new Label();
        switch (op) {
            case ">":
                Compile.mv.visitJumpInsn(Opcodes.IF_ICMPGT, trueLabel);
                break;
            case "<":
                Compile.mv.visitJumpInsn(Opcodes.IF_ICMPLT, trueLabel);
                break;
            case "==":
                Compile.mv.visitJumpInsn(Opcodes.IF_ICMPEQ, trueLabel);
                break;
            case ">=":
                Compile.mv.visitJumpInsn(Opcodes.IF_ICMPGE, trueLabel);
                break;
            case "<=":
                Compile.mv.visitJumpInsn(Opcodes.IF_ICMPLE, trueLabel);
                break;
        }
        Compile.mv.visitInsn(Opcodes.ICONST_0);
        Compile.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        Compile.mv.visitLabel(trueLabel);
        Compile.mv.visitInsn(Opcodes.ICONST_1);
        Compile.mv.visitLabel(endLabel);
    }
}
