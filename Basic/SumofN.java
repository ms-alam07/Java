// Write a program to find the sum of N natural numbers.

import java.util.*;

public class SumofN {
    public static void main(String[] args) {
        
        int n,sum=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");

        n=sc.nextInt();

        for(int i=0;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The sum of n natural no is:"+sum);
        sc.close();
    }
}
