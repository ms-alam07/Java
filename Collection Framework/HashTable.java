import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        
        Hashtable h = new Hashtable(); // helps to store key and value ...and both will be treated as objects

        h.put(1,"A");
        h.put(2,"B");
        h.put(3,"C");

        String s =(String) h.get(3); // we simply cant retrieve the element because the elements are stored as objects so typeacasting into string 

        System.out.println(h);
    }
}
