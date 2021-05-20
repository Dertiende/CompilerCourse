package Components;

public class Stmt extends Node{

    public Stmt(){}

    public static Stmt Null = new Stmt();

    public void gen (int b, int a) {}

    public Stmt Enclosing = Stmt.Null;


    public void genJVM() {
    }
}
