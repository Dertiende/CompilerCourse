package Components;

import Compile.Compile;
import org.objectweb.asm.Opcodes;
import symTable.Types;

import java.util.ArrayList;

public class callFuncArgs {
    Id id;
    Expr e;
    Boolean isLiteral = false;
    public callFuncArgs(Id id){
        this.id = id;

    }
    public callFuncArgs(Id id, Expr e){
        this.e = e;
        this.id = id;

        this.isLiteral = true;
    }

    public callFuncArgs(ArrayList<callFuncArgs> allArgs){

    }


}
