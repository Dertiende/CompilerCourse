package Components;

import symTable.Types;

public class ObjConst extends Stmt{
    public String name;
    public String val;
    public Types type;

    public String getName() {
        return name;
    }

    public String getVal() {
        return val;
    }

    public Types getType() {
        return type;
    }

    public ObjConst(String name,Types type, String val){
        this.name = name;
        this.type = type;
        this.val = val;
    }
}
