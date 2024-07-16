// Write a program to find the radix of a number.

import java.util.*;
public class Radix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        String str = sc.nextLine();

        if(str.matches("[01]+")){
            System.out.println("Radix is Binary Num is 2 ");
        }
        else if (str.matches("[0-7]+")){
            System.out.println("Radix of Octal no is 8");
            
        } else if(str.matches("[A-F0-9]+")){
            System.out.println("Radix of Hexadecimal is 16");            
        }
        else if(str.matches("[0-9]+")){
            System.out.println("Radix of Decimal is 10");
        }
        else{
            System.out.println("Invalid No");
        }
        sc.close();
    }
    
}
