import java.util.*;
public class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        for(int i=1;i<=100;i++){
            int temp=0;
            for(int j=2;j<=i-1;j++){
                if(i % j ==0){
                    temp +=1;
                }
            }
            if(temp==0){
                System.out.println(i);
            }
            else{
                temp=0;
            }
        }
        sc.close();
    }
}
