// Write a program for reverse copying the elements of array to another array.

import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7,8};
        int b[]= new int[a.length];

        System.out.println("Original Arrays is : "+ Arrays.toString(a));

        for(int i=0;i<a.length;i++){
            b[i] = a[a.length-1-i];
        }        
        System.out.println("Reverse Array is: "+Arrays.toString(b));
    }
}
