// Write a program to find the area of trinagle using three sides.

import java.util.*;

public class TraingleAreaUsingSides{
    public static void main(String[] args) {

        int a,b,c,s;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three sides");

        a =sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s =(a+b+c)/2;

        System.out.println("The value of S is: "+s);

        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("The area os triangle is:"+area);
        sc.close();
}
}