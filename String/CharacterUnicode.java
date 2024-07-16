// Write a Java program to get the character (Unicode code point) at the given index within the string.

public class CharacterUnicode {

    public static void main(String[] args) {
        
        String s = "w3resource.com";

        int i = s.codePointAt(1);
        int j = s.codePointAt(9);

        System.out.println("Character Unicode is: "+i);
        System.out.println("Character Unicode is: "+j);
    }
    
}
