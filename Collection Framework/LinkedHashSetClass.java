import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D"); // duplicates are'nt added in set interface
        lhs.add("E"); // duplicates are'nt added in set interface
        lhs.add("A");

        lhs.forEach((x)->System.out.println(x));

    }
}
