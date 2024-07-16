// Write a java program to remove the duplicate elements from the sorted array.

import java.util.*;
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        
        int a [] ={1,2,2,4,5,5,6};
        int b [] =new int[a.length];
        int j =0;
        int n = a.length;

        for(int i=0;i<n-1;i++){
            if(a[i] != a[i+1]){
                b[j] = a[i];
                j++;
            }
            b[j]=a[a.length-1];
        }

        System.out.println(Arrays.toString(b));
}
}
