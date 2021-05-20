package Components;

import org.objectweb.asm.Opcodes;
import symTable.Types;
import Compile.Compile;

public class Id extends Expr{

    public int offset;

    public Id(String id, Types p, int b) {super(id, p); offset = b;}

    public void genJVM(){
        if (Types.Int.equals(type) || Types.Bool.equals(type) || Types.Char.equals(type)) {
            Compile.mv.visitIntInsn(Opcodes.ILOAD, offset);
        } else if (Types.Float.equals(type)){
            Compile.mv.visitIntInsn(Opcodes.FLOAD, offset);
        }
    }
}
