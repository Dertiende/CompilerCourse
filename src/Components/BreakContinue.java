package Components;

import Compile.Compile;
import org.objectweb.asm.Opcodes;

import symTable.VisitImplement;

public class BreakContinue extends Stmt{
    String key;

    public BreakContinue ( String key){
        this.key = key;
    }

    public void genJVM() {
        if (key.equals("break")){
            Compile.mv.visitJumpInsn(Opcodes.GOTO, VisitImplement.end);
        }
        else{
            Compile.mv.visitJumpInsn(Opcodes.GOTO,VisitImplement.start);
        }
    }
}
