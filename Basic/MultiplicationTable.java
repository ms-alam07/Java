//  Write a program to find the multiplication table of any number.

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
         int n;
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter the Number");
         n=sc.nextInt();
         for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = "+n*i);
         }
         sc.close();
    }
    
}
