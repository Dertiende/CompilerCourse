package Components;

import Compile.Compile;
import org.objectweb.asm.Opcodes;
import symTable.Types;

import java.util.ArrayList;

public class callFunc extends Stmt{
    ArrayList<callFuncArgs> args;

    public callFunc(ArrayList<callFuncArgs> args){
        this.args = args;
    }

    public void genJVM(){
        System.out.println("Trying to call func");
        for(int i = 0;i<args.size();i++){
            if (args.get(i).e == null) {
                if (Types.Int.equals(args.get(i).id.type) || Types.Bool.equals(args.get(i).id.type) || Types.Char.equals(args.get(i).id.type)) {
                    Compile.mv.visitVarInsn(Opcodes.ILOAD, args.get(i).id.offset);
                } else if (Types.Float.equals(args.get(i).id.type)) {
                    Compile.mv.visitVarInsn(Opcodes.FLOAD, args.get(i).id.offset);
                } }
            else{
                System.out.println("LiteralReturn "+ args.get(i).e.op);
                if (Types.Int.equals(args.get(i).e.type) || Types.Bool.equals(args.get(i).e.type) || Types.Char.equals(args.get(i).e.type)) {
                    //e.genJVM();
                    Compile.mv.visitIntInsn(Opcodes.BIPUSH, Integer.parseInt(args.get(i).e.op));
                } else if (Types.Float.equals(args.get(i).e.type)) {
                    //e.genJVM();
                    Compile.mv.visitLdcInsn(new Float(args.get(i).e.op));
                }
            }
        }
    }
}
