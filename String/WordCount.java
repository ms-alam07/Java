// Write a porgrma to print the number of words in a string.

import java.util.*;
public class WordCount {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        str = str.replaceAll("\\s+", " ").trim();    /*To remove spaces */
        String words[] = str.split("\\s");
        System.out.println(words.length);

        sc.close();
    }
    
}
