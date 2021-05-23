package Compile;

import Components.Op;
import Components.Return;
import Components.Stmt;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import symTable.Types;
import symTable.VisitImplement;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Compile {

    Stmt main;
    Stmt consts;
    ArrayList<ArrayList> funcList;
    ArrayList<Stmt> allFunc;
    public static String className;
    public static MethodVisitor mv;
    private static ClassWriter cw;

    public Compile(){}

    public Compile(Stmt s) { main = s; }

    public  Compile(Stmt main, Stmt consts) {
        this.main = main;
        this.consts = consts;
    }
    public Compile(Stmt main, ArrayList<ArrayList> funcList, ArrayList<Stmt> allFunc){
        this.main = main;
        this.funcList = funcList;
        this.allFunc = allFunc;
    }

    public void generateClass(File file)
    {
        className =file.getName();
        if(className.contains(".")) className = className.substring(0,className.lastIndexOf('.'));

        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, className,null, "java/lang/Object", null);
        generateFunc();
        generateMain();
        cw.visitEnd();
        this.WriteClass(cw, file);
    }

    public void WriteClass(ClassWriter cw, File file){
        FileOutputStream fos;
        FileWriter test;
        try{
            fos = new FileOutputStream(file);
            fos.write(cw.toByteArray());
            fos.close();
        }
        catch (IOException ex){
            System.out.println("Writing class Error!");
        }
    }

    public void generateFunc(){

        String args;
        String descript;
        for (int fun = 0; fun<funcList.size();fun++) {
            args = "";
            for (int i = 2; i < funcList.get(fun).size(); i++) {
                //System.out.println("print " + funcList.get(fun).get(i));
                args = args + getType((String) funcList.get(fun).get(i));
                //System.out.println("args " + args);
            }
            descript = "(" + args + ")" + getType((String) funcList.get(fun).get(0));
            //System.out.println("desc " + descript);
            mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                                (String) funcList.get(fun).get(1), descript, null, null);
            //System.out.println("cap "+allFunc.size());
            Stmt thisFunc = allFunc.get(fun);
            //System.out.println(" f" + thisFunc);
            if (thisFunc != null) thisFunc.genJVM();

            mv.visitInsn(getReturnType((String) funcList.get(fun).get(0)));
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
    }

    public int getReturnType(String s){
        //System.out.println("rtype " +s);
        if (s.equals("int")) return Opcodes.IRETURN;
        if (s.equals("float")) return Opcodes.FRETURN;
        if (s.equals("bool")) return Opcodes.RETURN;
        return 0;
    }

    public static String getType(String s) {
        if (s.equals("int")) return "I";
        if (s.equals("float")) return "F";
        if (s.equals("bool")) return "Z";
        return "C";
    }

    public void generateMain() {
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
        //System.out.println(" m"+main);
        if (main != null) main.genJVM();
        else System.out.println("Statement is clear");
        //mv.visitMethodInsn(Opcodes.INVOKESTATIC, className,"check","(IFI)I",false);
        //mv.visitFrame(Opcodes.;
        //mv.visitInsn(Opcodes.POP);
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(1,1);
        mv.visitEnd();
    }

    public void generateConst() {
//        for (CValue cv : consts) {
//            cw.visitField(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC + Opcodes.ACC_FINAL,
//                    cv.varName,
//                    cv.getType(),
//                    null,
//                    cv.getValue());
//        }
    }

}
