package Components;

import org.objectweb.asm.Opcodes;
import symTable.Types;
import Compile.Compile;

public class Print extends Stmt{
    Expr expr;

    public Print (Expr x) {
        expr = x;
        //System.out.println("trying to print "+ expr);
    }
    public  Print (String s){

    }

    public void genJVM() {

        Compile.mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expr.genJVM();
        String t = "";

        if (Types.Int.equals(expr.type)) t = "(I)V";
        else if (Types.Float.equals(expr.type)) t = "(F)V";
        else if (Types.Char.equals(expr.type)) t = "(C)V";
        else if (Types.Bool.equals(expr.type)) t = "(Z)V";
        Compile.mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", t, false);
    }
}
