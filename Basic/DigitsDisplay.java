// Write a program to display the digits of number.

import java.util.*;
public class DigitsDisplay {
    public static void main(String[] args) {        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
         int n= sc.nextInt();
         int r;

        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println("The didgits are"+ r);
        }
        sc.close();
        }
    }
