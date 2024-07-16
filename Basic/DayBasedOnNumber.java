// Write a program to display the day based on number.

import java.util.*;
public class DayBasedOnNumber {
    public static void main(String[] args) {
        
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        day =sc.nextInt();


        switch(day){
            case 1:
            System.out.println("It is Monday");
            break;

            case 2:
            System.out.println("It is Tuesday");
            break;

            case 3:
            System.out.println("It is Wednesday");
            break;

            case 4:
            System.out.println("It is Thursday");
            break;

            case 5:
            System.out.println("It is Friday");
            break;

            case 6:
            System.out.println("It is Saturday");
            break;

            case 7:
            System.out.println("It is Sunday");
            break;
        }
        sc.close();

    }
}
