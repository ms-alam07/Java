// Write a program to left rotate all the elements of an array.

public class LeftRotation {
    public static void main(String[] args) {
        
        int A[] = {7,15,6,18,9,13};

        for(int x:A){
            System.out.print(x+",");
            System.out.println("");
        }
       int temp = A[0];

       for(int i=1;i<A.length;i++){
        A[i-1]=A[i];
       }
       A[A.length-1]= temp;

       for(int x:A){
            System.out.print(x+",");
        }
    }
}
