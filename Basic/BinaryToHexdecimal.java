// Write a Java program to convert a binary number to a hexadecimal number.

import java.util.*;
public class BinaryToHexdecimal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        String b1= sc.next();

        int decimal = Integer.parseInt(b1,2);

        String hex= Integer.toHexString(decimal).toUpperCase();

        System.out.println(hex);
        sc.close();
    }
}
