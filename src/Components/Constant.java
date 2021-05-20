package Components;

import org.objectweb.asm.Opcodes;
import symTable.Types;
import Compile.Compile;

public class Constant extends Expr{

    public Constant (String s, Types t) {super(s,t);}

    public static final Constant
            True = new Constant("true", Types.Bool),
            False = new Constant("false", Types.Bool);

    public void genJVM(){
        Types p = type;
        if (Types.Int.equals(p)) {
            int i = Integer.parseInt(op.toString());
            if (Math.abs(i) >= 128) {
                Compile.mv.visitIntInsn(Opcodes.SIPUSH, i);
            }
            else {
                Compile.mv.visitIntInsn(Opcodes.BIPUSH, i);
            }
        } else if (Types.Float.equals(p)) {
            Compile.mv.visitLdcInsn(Float.parseFloat(op.toString()));
        } else if (Types.Char.equals(p)) {
            Compile.mv.visitIntInsn(Opcodes.BIPUSH, (int) (op.toString().charAt(0)));
        } else if (Types.Bool.equals(p)) {
            if (Boolean.parseBoolean(op.toString())) Compile.mv.visitInsn(Opcodes.ICONST_1);
            else Compile.mv.visitInsn(Opcodes.ICONST_0);
        }

    }
}
