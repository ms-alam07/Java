// Write a Java program to convert a decimal number to an octal number.

import java.util.*;
public class DecimalToOctal {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number");
        int d1 = sc.nextInt();

        String octal = Integer.toOctalString(d1);
        System.out.println("The value after Conversion is: "+octal);
        sc.close();
    }
}
