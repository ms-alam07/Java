// Write a program to remove the extra spaces from a given string.

import java.util.*;
public class RemoveSpaces {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println(str.replaceAll("\\s+", " ").trim());
        sc.close();
    }
    
}
