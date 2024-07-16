// Write a program to delete an element from a given array.

import java.util.*;
public class DeletionOfElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a[]= new int[10];
        a[0]=3;a[1]=6;a[2]=9;a[3]=12;a[4]=15;

        int n=5;

        System.out.println("Original Array is: "+Arrays.toString(a));

        System.out.println("Enter the index of the element u want to delete: ");
        int index =sc.nextInt();

        for(int i=index;i<n;i++){
            a[i]=a[i+1];
        }
        System.out.println("New Array after deletion is: "+Arrays.toString(a));
        sc.close();
        
    }
}
