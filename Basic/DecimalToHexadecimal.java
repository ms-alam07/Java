// Write  a program to  convert an Decimal number to a HexaDecimal number.

import java.util.*;
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int d1 = sc.nextInt();

        String hex = Integer.toHexString(d1);

        System.out.println("The value after Conversion is: "+ hex);
        sc.close();


    }
}
