package Components;

import Compile.Compile;
import org.objectweb.asm.Opcodes;
import symTable.Types;

public class Return extends Stmt {
    Id id;
    Expr e;
    Boolean isLiteral = false;
    public Return(Id id) {
        this.id = id;
        System.out.println("trying to return "+ id.op);
    }
    public Return (Expr e){
        this.e = e;
        this.isLiteral = true;
    }

    public void genJVM(){
        //System.out.println("trying to return "+ id.op);
        if (!isLiteral) {
            if (Types.Int.equals(id.type) || Types.Bool.equals(id.type) || Types.Char.equals(id.type)) {
                Compile.mv.visitVarInsn(Opcodes.ILOAD, id.offset);
            } else if (Types.Float.equals(id.type)) {
                Compile.mv.visitVarInsn(Opcodes.FLOAD, id.offset);
            } }
        else{
            System.out.println("LiteralReturn "+ e.op);
            if (Types.Int.equals(e.type) || Types.Bool.equals(e.type) || Types.Char.equals(e.type)) {
                //e.genJVM();
                Compile.mv.visitLdcInsn(Opcodes.LDC);
            } else if (Types.Float.equals(e.type)) {
                //e.genJVM();
                Compile.mv.visitLdcInsn(Opcodes.LDC);
            }
            }

    }
}
