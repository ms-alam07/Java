// Write a java program to concatenate two string names.

import java.util.*;
public class ConcatName{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your First Name");
        String FirstName = sc.nextLine();

        System.out.println("Enter Your Last Name");
        String LastName = sc.nextLine();

        String FullName = FirstName.concat(" "+LastName);

        //String FullName = FirstName +" "+LastName;

        System.out.println("Your Full Name is "+FullName);
        sc.close();
    }
}