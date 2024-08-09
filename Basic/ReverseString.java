// Write a program to reverse the String.

import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        char[] words= sc.nextLine().toCharArray(); // string is converted into array of characters

        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]);
        }
        sc.close();
    }
}
