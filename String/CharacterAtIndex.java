// Write a java porgram to get the character at the given index within the string.

public class CharacterAtIndex {

    public static void main(String[] args) {
        
        String s= new String("Hello World");
        System.out.println("Original String is: "+s);

        char i = s.charAt(4);
        char j = s.charAt(8);

        System.out.println("Character at position 4 is:"+i);
        System.out.println("Character at position 10 is:"+j);
    }
}
