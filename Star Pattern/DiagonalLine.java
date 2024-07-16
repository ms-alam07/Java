// Write a program to print the following pattern.
// *
//  *
//   *
//    *
//     * 

public class DiagonalLine {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.println("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
    
}
