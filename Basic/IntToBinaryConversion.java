// Write  a program to  convert an integer number to a binary number.

import java.util.*;

public class IntToBinaryConversion{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number");
        int a= sc.nextInt();

        String binary= Integer.toBinaryString(a);

        System.out.println("The Number after Conversion is: "+binary);
        sc.close();
    }
}