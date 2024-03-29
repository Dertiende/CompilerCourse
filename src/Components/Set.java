package Components;

import org.objectweb.asm.Opcodes;
import symTable.Table;
import symTable.Types;
import Compile.Compile;

public class Set extends Stmt{

    public Id id;
    public Expr expr;

    public Set (Id i) {
        id = i; expr= null;
    }

    public Set (Id i, Expr x){
        id = i;
        expr = x;
        if (check(id.type, expr.type) == null) error("unsupported type");
    }

    public Types check(Types p1, Types p2){
        if (Types.numeric(p1) && Types.numeric(p2))
        {
            if (p1.equals(Types.Int) && !(p2.equals(Types.Int))  ){

            }

            return p2;
        }


        else if (p1 == Types.Bool && p2 == Types.Bool) return p2;
        else return null;
    }

    public void genJVM(){
        Types p = id.type;
        Types t = expr.type;

        if (Types.Int.equals(p)) {
            expr.genJVM();
            if (expr.op.equals("/")){
                Compile.mv.visitInsn(Opcodes.F2I);
            }
            Compile.mv.visitVarInsn(Opcodes.ISTORE, id.offset);
        } else if (Types.Float.equals(p)) {
            if (Types.Int.equals(t)){
                Compile.mv.visitInsn(Opcodes.I2F);
            }

            expr.genJVM();
            Compile.mv.visitVarInsn(Opcodes.FSTORE, id.offset);
        } else if (Types.Char.equals(p)) {
            expr.genJVM();
            Compile.mv.visitVarInsn(Opcodes.ISTORE, id.offset);
        } else if (Types.Bool.equals(p)) {
            expr.genJVM();
            Compile.mv.visitVarInsn(Opcodes.ISTORE, id.offset);
        }
    }
}
