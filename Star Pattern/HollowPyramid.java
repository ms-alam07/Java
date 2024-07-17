// Write a program to print the following pattern.
//     *
//    * *
//   *   *
//  *     *
// *       *
public class HollowPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                if(k>1 && k<(i*2)-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        } 
    }
}
