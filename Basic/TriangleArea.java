// Write a program to find the area of Trinagle.

import java.util.*;

public class TriangleArea {
    public static void main(String[] args) {
        float base,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and height ");

        base = sc.nextFloat();
        height = sc.nextFloat();
        area = (base*height)/2;
        System.out.println("Area of Tringle is "+area);
        sc.close();
        
    }
    
}
