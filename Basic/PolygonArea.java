// // Write a program to compute the area of polygon.

import java.util.*;
public class PolygonArea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of a side");
        int side = sc.nextInt();

        System.out.println("Enter the number of sides");
        int n= sc.nextInt();

        Double area =(n* side*side)/(4*Math.tan(Math.PI/n));

        System.out.println("The area of Polygon with "+n+" sides is: "+area);
        sc.close();
    }
}
