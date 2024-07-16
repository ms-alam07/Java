// Write a program to find a given number is binary number or not.

import java.util.*;
public class BinaryOrNot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int bno = sc.nextInt();

        String str = String.valueOf(bno);
        System.out.println(str.matches("[01]+"));
        sc.close();
    }
    
}
