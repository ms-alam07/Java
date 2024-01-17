// Write a program to print the following pattern.
// *
//  *
//   *
//    *
//     * 

import java.lang.*;
public class diagonalpattern {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i>=2 && j<=i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.println("*");
                }
            }
        }
    }
    
}
