// Write a java porgram to create a String with Char Array.

public class StringWithCharArray {
    public static void main(String[] args) {
        
        char c []= new char[]{'1','2','3','4','5'};

        String s =  String.copyValueOf(c,1,4);

        System.out.println(s);

    }
    
}
