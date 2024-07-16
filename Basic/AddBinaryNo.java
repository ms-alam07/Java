// Write a program to add two Binary Numbers.

import java.util.*;

public class AddBinaryNo{
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter the First Binary Number");
        String b1 = sc.next();

        System.out.println("Enter the Second Binary Number");
        String b2 = sc.next();

        int d1= Integer.parseInt(b1, 2);
        int d2= Integer.parseInt(b2, 2);

        int sum = d1+d2;

        String binarySum =Integer.toBinaryString(sum);
        System.out.println("The sum is: "+binarySum);

        sc.close();
    }
}