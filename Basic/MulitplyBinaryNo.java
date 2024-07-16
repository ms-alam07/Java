// Write a program to multiply two Binary Numbers.

import java.util.*;
public class MulitplyBinaryNo {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the First Number");
         String b1 = sc.next();

         System.out.println("Enter the First Number");
         String b2= sc.next();

         int d1=Integer.parseInt(b1,2);
         int d2=Integer.parseInt(b2,2);

         int product = d1*d2;

         String binaryProduct = Integer.toBinaryString(product);
         System.out.println("The Product is: "+binaryProduct);
         sc.close();

    }
}
