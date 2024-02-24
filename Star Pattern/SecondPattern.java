// Write a program to print the following pattern.

// ****
// ***
// **
// *

public class SecondPattern {
    public static void main(String[] args) {
        
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
