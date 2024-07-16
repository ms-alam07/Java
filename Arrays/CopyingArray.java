// Write a program for copying elements of array to another array.

import java.util.Arrays;
public class CopyingArray {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7,8};
        int b[]=new int[10];

        System.out.println("Original Array is: "+Arrays.toString(a));

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("New Array is: "+Arrays.toString(b));
    }
}
