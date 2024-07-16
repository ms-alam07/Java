import java.util.*;
public class PrimeNo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number :");

        int n = sc.nextInt();
        int temp=0;

        for(int i=2;i<=n-1;i++){
            if(n %i==0){
                temp +=1;
            }
        }
        if(temp>0){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("Not a Prime Number.");
        }
        sc.close();
    }
}