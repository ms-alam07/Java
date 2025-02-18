import java.util.*;

public class TreeMapClass {
    public static void main(String[] args) {
        // Creating a mutable TreeMap (without using Map.of())
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "A");
        tm.put(2, "B");
        tm.put(3, "C");
        tm.put(4, "D");

        // Adding a new key-value pair
        tm.put(5, "E"); 

        // Creating a HashMap
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(20, "Z");
        System.out.println("HashMap: " + hm);

        // TreeMap operations
        System.out.println("TreeMap: " + tm);
        System.out.println("Ceiling entry for key 5: " + tm.ceilingEntry(5).getValue());
        System.out.println("Does TreeMap contain key 7? " + tm.containsKey(7));
    }
}
