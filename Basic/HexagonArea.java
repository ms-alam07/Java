// Write a program to compute the area of hexagon.

import java.util.*;
public class HexagonArea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side");
        int side =sc.nextInt();

        Double area = (6*side*side)/(4*Math.tan(Math.PI/6));

        System.out.println("The Area of hexagon is:"+area);
        sc.close();
    }
}
