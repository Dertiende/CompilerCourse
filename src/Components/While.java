package Components;

import org.objectweb.asm.Label;
import org.objectweb.asm.Opcodes;
import Compile.Compile;
import symTable.VisitImplement;

public class While extends Stmt{

    Expr expr;
    Stmt stmt;
    public Label startCycle;
    public Label statements;
    public Label endCycle;

    public While (Expr x, Stmt s) {expr = x; stmt = s;}

    public void genJVM() {
        startCycle = new Label();
        statements = new Label();
        endCycle = new Label();
        VisitImplement.start = startCycle;
        VisitImplement.end = endCycle;
        System.out.println("IN WHILE");
        Compile.mv.visitLabel(startCycle);
        //Compile.mv.visitFrame(Opcodes.F_NEW,0,null,0,null);
        expr.genJVM();
        Compile.mv.visitJumpInsn(Opcodes.IFEQ, endCycle);

        Compile.mv.visitLabel(statements);
        stmt.genJVM();
        Compile.mv.visitJumpInsn(Opcodes.GOTO, startCycle);
        Compile.mv.visitLabel(endCycle);

    }
}
