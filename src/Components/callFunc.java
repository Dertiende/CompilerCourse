package Components;

import Compile.Compile;
import org.objectweb.asm.Opcodes;
import symTable.Types;

import java.util.ArrayList;

public class callFunc extends Expr{
    ArrayList<callFuncArgs> args;
    String descript;
    String fName;
    Id id;

    public callFunc(ArrayList<callFuncArgs> args,String fName, Id id){
        super(fName,id.type);
        this.args = args;
        this.fName = fName;
        this.id = id;

    }

    public void genJVM(){
        descript = "(";
        //System.out.println("Trying to call func");
        for(int i = 0;i<args.size();i++){
            if (args.get(i).e == null) {
                descript = descript +Compile.getType(Types.getString(args.get(i).id.type));
                //System.out.println("Descript "+ descript);
                if (Types.Int.equals(args.get(i).id.type) || Types.Bool.equals(args.get(i).id.type) || Types.Char.equals(args.get(i).id.type)) {
                    Compile.mv.visitVarInsn(Opcodes.ILOAD, args.get(i).id.offset);
                } else if (Types.Float.equals(args.get(i).id.type)) {
                    Compile.mv.visitVarInsn(Opcodes.FLOAD, args.get(i).id.offset);
                } }
            else{
                descript = descript +Compile.getType(Types.getString(args.get(i).e.type));
                //System.out.println("Descript "+ descript);
                //System.out.println("LiteralReturn "+ args.get(i).e.op);
                if (Types.Int.equals(args.get(i).e.type) || Types.Bool.equals(args.get(i).e.type) || Types.Char.equals(args.get(i).e.type)) {
                    //e.genJVM();
                    Compile.mv.visitLdcInsn(new Integer( Integer.parseInt(args.get(i).e.op)));
                } else if (Types.Float.equals(args.get(i).e.type)) {
                    //e.genJVM();
                    Compile.mv.visitLdcInsn(new Float(args.get(i).e.op));
                }
            }
        }
        descript = descript+")" +Compile.getType(Types.getString(id.type));
        //System.out.println("Descript "+ descript);
        Compile.mv.visitMethodInsn(Opcodes.INVOKESTATIC, Compile.className,fName,descript,false);
    }
}
