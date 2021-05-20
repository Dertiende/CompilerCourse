package symTable;

import Components.Id;

import java.util.HashMap;
import java.util.Map;

public class Table {
    private HashMap <String, Id> table;

    protected Table prev;

    public Table(Table t) {table = new HashMap<>();prev = t;}

    public void put(String s,Id e) {table.put(s,e);}
    public void print(String name){
        for (Map.Entry<String,Id> entry : table.entrySet()){
            String s = entry.getKey();
            Id e = entry.getValue();
            System.out.println(name+": /op/ " +e.op+" /type/ "+e.type.type);
        }
        System.out.println(name+": "+table.keySet());
    }

    public Id get(String s){
        for(Table n = this;n != null;n=n.prev){
            Id found = (Id) (n.table.get(s));
            if (found != null) return found;
        }
        return null;
    }
}
