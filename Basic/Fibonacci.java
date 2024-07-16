// Write a program to find the fibonacci series of given number.

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n =sc.nextInt();

        int a=0,b=1,c;
        System.out.println(a + "," + b );
        for(int i=0;i<n-2;i++){  /*bcz 0 and 1 are the first two numbers */
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
        sc.close();
    }
    
}
