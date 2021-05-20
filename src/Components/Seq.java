package Components;

import org.objectweb.asm.Label;
import Compile.Compile;


public class Seq extends Stmt{

    Stmt n1;
    Stmt n2;
    public Seq (Stmt s1,Stmt s2) {n1 = s1; n2 = s2;}

    public void genJVM() {
        if ( n1 == null ) {
            n2.genJVM();
        }
        else if ( n2 == Stmt.Null ) {
            n1.genJVM();
        }
        else {
            Label l1 = new Label();
            Compile.mv.visitLabel(l1);
            n1.genJVM();
            Label l2 = new Label();
            Compile.mv.visitLabel(l1);
            n2.genJVM();
        }
    }
}
