// Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

import java.util.*;
public class MoveZeroesToLast {
    
    public static void main(String[] args) {
        int a []= {0,0,1,2,3,0,4,5};
        int n =a.length;
        int index=0;

        for(int i=index;i<n;i++){
            if(a[i] != 0){
                a[index] = a[i];
                index++;
            }
        }

        while(index<n){
            a[index++] =0;
        }

        System.out.println("New Array is: "+Arrays.toString(a));
    }
}
