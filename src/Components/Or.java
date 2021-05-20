package Components;

import org.objectweb.asm.Opcodes;
import Compile.Compile;

public class Or extends Logical{

    public Or (String s, Expr x1, Expr x2) { super(s, x1, x2);}


    public void genJVM() {
        System.out.println("OR!!");
        expr1.genJVM();
        expr2.genJVM();
        System.out.println("IADD");
        Compile.mv.visitInsn(Opcodes.IADD);
    }
}
