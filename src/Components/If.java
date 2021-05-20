package Components;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import symTable.Types;
import Compile.Compile;

public class If extends Stmt{

    Expr expr;
    Stmt stmt;

    public If (Expr x, Stmt s){
        expr = x;
        stmt = s;
        if (expr.type != Types.Bool) expr.error("bool type required");
    }

    public void genJVM() {
        expr.genJVM();
        Label trueLabel = new Label();
        Label endLabel = new Label();
        Compile.mv.visitJumpInsn(Opcodes.IFNE, trueLabel);
        Compile.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        Compile.mv.visitLabel(trueLabel);
        stmt.genJVM();
        Compile.mv.visitLabel(endLabel);
    }
}
