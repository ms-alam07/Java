// Write a program to print the following pattern.
// 5
// 54
// 543
// 5432
// 54321

public class ReverseBase{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}