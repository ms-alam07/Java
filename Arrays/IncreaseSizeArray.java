// Write a program to increase the size of array.

import java.util.Arrays;
public class IncreaseSizeArray {
    public static void main(String[] args) {
        
        int a[]={2,4,6,8,10};
        int b[]=new int[2*a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }

        System.out.println("New Array is: "+Arrays.toString(b)); // we have used this we cant directly print the elements of array.
    }
}
