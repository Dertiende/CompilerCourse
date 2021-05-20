package Components;


import symTable.Types;

public class Logical extends Expr{

    public Expr expr1,expr2;

    Logical(String s, Expr x1, Expr x2){
        super(s, null);
        expr1 = x1;
        expr2 = x2;
        type = check(expr1.type,expr2.type);
        if (type == null) error("unsupported type");
    }

    public Types check (Types p1, Types p2){
        if (p1 == Types.Bool && p2 == Types.Bool) return Types.Bool;
        else return null;
    }

    public void genJVM() {
        System.out.println("OP!!!!!!!!!!: " + expr1.op.toString());
        System.out.println("OP!!!!!!!!!!: " + expr2.op.toString());
        if (expr1 != null) expr1.genJVM();
        if (expr2 != null) expr2.genJVM();
    }
}
