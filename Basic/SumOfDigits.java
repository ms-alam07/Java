//  Write a Java program and compute the sum of an integer's digits.

import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int sum=0;

        while(n!=0){
            int digits=n%10;
            sum += digits;
            n= n/10;
        }
        System.out.println("The sum of the digits of  is: " + sum);
        sc.close();
    }
}
