package Components;

import symTable.Types;

public class Expr extends Node{
    public String op;
    public Types type;

    public Expr(String s, Types t) {op = s; type = t;}


    public String toString() {return op;}


    protected void genJVM() {
    }
}
