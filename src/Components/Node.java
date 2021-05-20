package Components;

public class Node {
    int lline = 0;
    Node() {}
    Node(int i) { lline = i;}

    public static Node Null = new Node();

    void error(String s) { throw new Error(s);}
}
