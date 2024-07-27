// Write a program to print the following pattern.
// 12345
// 1234
// 123
// 12
// 1




public class BaseNumber3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
