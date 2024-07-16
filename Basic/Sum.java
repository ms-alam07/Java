// Write a program to find the sum of given Integers.

import java.util.*;
public class Sum {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int x,y;
         System.out.println("enter two numbers");
         x = sc.nextInt();
         y = sc.nextInt();

         int z = x+y;
         System.out.println("sum is" +"  " + z);
         sc.close();
    }
}