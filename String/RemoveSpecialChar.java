// Write a program to remove special character from a given character.

import java.util.*;
public class RemoveSpecialChar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str =sc.nextLine();

        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
        sc.close();
    }
    
}
