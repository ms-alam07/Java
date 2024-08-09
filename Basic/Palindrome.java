// Write a program to find the palindrome of a number.

import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int r,rev=0;
        int temp=n;

        while(n>0){
            r = n%10;
            rev =rev*10+r;
            n = n/10;
        }
        if(rev==temp){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }
        sc.close();
    }
    
}
