// Write a Java program to compare a given string to the specified character sequence.

public class ContentEquals {
    
    public static void main(String[] args) {
        
        String s1 = "example.com";
        String s2 = "EXAMPLE.COM";

        CharSequence c = "example.com";

        System.out.println("Comparing "+s1+"and "+c+" : "+s1.contentEquals(c));
        System.out.println("Comparing "+s2+"and "+c+" : "+s2.contentEquals(c));
        
    }
}
