import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
            int p=sc.nextInt();
            System.out.println("Enter the Rate Interest");
            int r=sc.nextInt();
            System.out.println("Enter the Time(in Yrs)");
            int t=sc.nextInt();
            int s=(p*r*t)/100;
            int tt =s+p;
        System.out.println("Result is: "+s);
        System.out.println("Total cost: "+tt);
        sc.close();
    }
}
