//Write a Java program to convert a binary number to a decimal number.

import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        String s1= sc.next();

        int d1= Integer.parseInt(s1,2);
        System.out.println("The Value after Conversion is: "+d1);
        sc.close();
    }
}
