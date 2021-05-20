package symTable;


public class Types {
    String type;
    public int memWidth = 0;

    public Types(String s, int w) {type = s; memWidth = w;}

    public static final Types
            Int = new Types("int",4),
            Float = new Types("float",4),
            Char = new Types("char",1),
            Bool = new Types("bool", 1);

    public static Types getType(String s)
    {
        if (s.equals("int")) return Int;
        else if (s.equals("float")) return Float;
        else if (s.equals("char")) return Char;
        else if (s.equals("bool")) return  Bool;
        else return null;
    }

    public static boolean numeric(Types p) {
        if (p == Types.Char || p == Types.Int || p == Types.Float) return true;
        else return false;
    }

    public static Types max(Types p1, Types p2 ) {
        if ( ! numeric(p1) || ! numeric(p2) ) return null;
        else if ( p1 == Types.Float || p2 == Types.Float ) return Types.Float;
        else if ( p1 == Types.Int   || p2 == Types.Int   ) return Types.Int;
        else return Types.Char;
    }
}
