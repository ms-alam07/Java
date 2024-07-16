// Write a program to find the date in date format(dd/mm/yyyy).


import java.util.*;
public class DateFormat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        String date = sc.nextLine();

        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        sc.close();
    }
}
