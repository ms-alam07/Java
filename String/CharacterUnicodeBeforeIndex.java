// Write a Java program to get the character (Unicode code point) before the specified index within the string.

public class CharacterUnicodeBeforeIndex {
    
    public static void main(String[] args) {

        String s= "w3resource.com";

        int i =s.codePointBefore(1);
        int j =s.codePointBefore(9);

        System.out.println("Character Unicode Before Index: "+i);
        System.out.println("Character Unicode Before Index: "+j);
    }
}
