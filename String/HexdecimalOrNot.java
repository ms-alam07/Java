// Write a program to find a given a number is hexadecimal or not.

import java.util.*;
public class HexdecimalOrNot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number");
        String hno =sc.nextLine();
        
        System.out.println(hno.matches("[A-F0-9]+"));     /*HEXADECIMAL=[A-F0-9] */
        sc.close();
    }
    
}
