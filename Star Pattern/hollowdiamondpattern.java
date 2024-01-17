// Write a program to print the following pattern.
//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

import java.lang.*;
public class hollowdiamondpattern {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0;j<=2*i-3;j++){
                if(j==2*i-3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }    
}
