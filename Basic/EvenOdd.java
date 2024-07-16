//  Write a program to find whether a given number is even or odd.

import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        System.out.println("Enter the Number");
        int n =sc.nextInt();

        if(n%2==0){
            System.out.println("The Number is even number");
        }
        else{
            System.out.println("The number is odd number");
        }
        sc.close();
    }
    
}
