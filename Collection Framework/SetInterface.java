import java.util.*;
public class SetInterface {
    
    public static void main(String[] args) {
         HashSet<Integer> hs= new HashSet<>(); // default  initial capacity
         HashSet<Integer> h2= new HashSet<>(10); //  initial capacity of 10
         HashSet<Integer> h3= new HashSet<>(10,0.75f); //  initial capacity with loading factor

         hs.add(10);
         hs.add(20);
         hs.add(10);
         hs.add(30);
         System.out.println(h2.size());
         System.out.println(h3.size());
         hs.forEach((x)->System.out.println(x)); // printing using lambda expression
         System.out.println(hs);

    }
}
