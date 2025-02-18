import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");

        int n = sc.nextInt();
        int temp = 0;

        // Loop should run till n-1 is fine (though not optimized)
        for (int i = 2; i <= n - 1; i++) {  
            if (n % i == 0) {
                temp += 1; // Increment temp if n is divisible by i
            }
        }

        if (temp > 0) {
            System.out.println("Not a Prime Number.");
        } else {
            System.out.println("It is a Prime Number");
        }

        sc.close();
    }
}
