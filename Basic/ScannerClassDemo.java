import java.util.*;
public class ScannerClassDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String name = sc.nextLine();

        System.out.println("Enter the Age:");
        int age = sc.nextInt();

        System.out.println("Enter yout Department:");
        String dept = sc.next();

        System.out.println("Enter your percentage:");
        float percent = sc.nextFloat();

        System.out.println("Name is: " + name + "Age is: " + age + "Department is: " + dept + " Percentage is: " + percent);
        sc.close();

    }
}
