// Write a program to find whether a number is armstorng or not.(153,371)

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        int r;

        while(n>0){
            r=n%10;
            sum= sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("It is an Armstrong Number");
        }
        else{
            System.out.println("It is not an Armstrong Number");
        }
        sc.close();
    }
}