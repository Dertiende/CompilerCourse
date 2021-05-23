package main;

import LangSi.LangSiLexer;
import LangSi.LangSiParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symTable.VisitImplement;

import java.io.FileInputStream;
import java.io.IOException;

class Main {

    public static void main(String[] args) {
        try{
            if (args.length<1){
                //System.out.println("file path required");
                return;
            }
            String f = args[0];
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(f));

            LangSiLexer lex = new LangSiLexer(input);
            LangSiParser parser = new LangSiParser(new CommonTokenStream(lex));
            ParseTree tree = parser.compileUnit();
            VisitImplement visit = new VisitImplement();
            visit.visit(tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
