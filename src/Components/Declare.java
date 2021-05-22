package Components;

import org.objectweb.asm.Opcodes;
import symTable.Types;
import Compile.Compile;
import symTable.VisitImplement;

public class Declare extends Stmt{

    public Id id;
    public Expr expr;

    public Declare (Id i) {
        id = i; expr = null;
    }

    public Declare (Id i,Expr x) {
        id = i;
        expr = x;
        if ( check(id.type, expr.type) == null ) error("type error");

    }
    public Types check(Types p1,Types p2){
        if ( Types.numeric(p1) && Types.numeric(p2) ) return p2;
        else if ( p1 == Types.Bool && p2 == Types.Bool ) return p2;
        else return null;
    }

    public void genJVM(){
        Types p = id.type;
        System.out.println("deb"+expr.op+" "+ expr.type+" "+id.op);

        expr.genJVM();
        //
        if (Types.Int.equals(p)) {
            if (expr.op.equals("/")){
                Compile.mv.visitInsn(Opcodes.F2I);
            }
            Compile.mv.visitVarInsn(Opcodes.ISTORE, id.offset);
        } else if (Types.Float.equals(p)) {
            if (expr.type.equals(Types.Int)){
                Compile.mv.visitInsn(Opcodes.I2F);
            }
            Compile.mv.visitVarInsn(Opcodes.FSTORE, id.offset);
        } else if (Types.Char.equals(p)) {
            Compile.mv.visitVarInsn(Opcodes.ISTORE, id.offset);
        } else if (Types.Bool.equals(p)) {
            Compile.mv.visitVarInsn(Opcodes.ISTORE, id.offset);
        }
    }
}
