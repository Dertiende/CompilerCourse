package Components;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import Compile.Compile;

public class While extends Stmt{

    Expr expr;
    Stmt stmt;

    public While (Expr x, Stmt s) {expr = x; stmt = s;}

    public void genJVM() {
        Label startCicle = new Label();
        Label statments = new Label();
        Label endCicle = new Label();
        Compile.mv.visitLabel(startCicle);
        //Compile.mv.visitFrame(Opcodes.F_NEW,0,null,0,null);
        expr.genJVM();
        Compile.mv.visitJumpInsn(Opcodes.IFEQ, endCicle);

        Compile.mv.visitLabel(statments);
        stmt.genJVM();
        Compile.mv.visitJumpInsn(Opcodes.GOTO, startCicle);
        Compile.mv.visitLabel(endCicle);
    }
}
