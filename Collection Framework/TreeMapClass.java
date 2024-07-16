import java.util.*;
public class TreeMapClass {
    
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
        tm.put(5, "E"); //  adding a new key with value

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(20,"Z");
        System.out.println(hm);

        // All the Methods of TreeMap and HashMap are almost same.
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(5).getValue());
        System.out.println(tm.containsKey(7));
    }
}
