// Write a program to reverse a number.

import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int r,rev=0;

        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse of Number is "+rev);
        sc.close();
    }
    
}
