//  Write a program to find the area and volume of cuboid.

import java.util.*;

public class Cuboid {
    public static void main(String[] args) {
         int l,b,h;
         double area,volume;

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the value of sides of cuboid");

         l = sc.nextInt();
         b = sc.nextInt();
         h = sc.nextInt();
         

         area = 2*((l*b)+(b*h)+(h*l));

         volume = (l*b*h);

         System.out.println("The area of cuboid is: "+area);
         System.out.println("The volume of cuboid is "+volume);
         sc.close();

    }
    
}
