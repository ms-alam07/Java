// Write a program to find the roots of Quadratic Equation.

import java.util.*;

public class QuadEqn {
    public static void main(String[] args) {
        
        int a,b,c;
        double r1,r2;

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the values of Constant");

        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        r1 = (-b + (Math.sqrt(b*b-4*a*c)/2*a));
        r2 = (-b - (Math.sqrt(b*b-4*a*c)/2*a));

        System.out.println(" The Root r1 value is:"+r1);
        System.out.println(" The Root r2 value is:"+r2);
        sc.close();
    }
    
}
