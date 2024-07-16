// Write a program to find the arithmetic progression series.

import java.util.*;
public class APseries {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of d");
        int d = sc.nextInt();
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        System.out.println("=====================");

        int term=a;
        for(int i=1;i<=n;i++){
            System.out.println(term);
            term=term+d;
        }
        sc.close();
    }
    
}
