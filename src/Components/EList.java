package Components;

import symTable.Types;

public class EList extends Expr{

    Expr x1, x2;

    public EList(Expr x1, Expr x2){
        super("elist: ", new Types("str", 0));
        this.x1 = x1;
        this.x2 = x2;

    }
}
