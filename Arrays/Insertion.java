// Write a program to insert new element in a given array.

import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int a[]=new int[10];
        a[0]=5;  a[1]=8;  a[2]=17;  a[3]=13;  a[4]=9;  a[5]=18;
        int n=6;

        System.out.println("Original Array is: "+Arrays.toString(a));

        System.out.println("Enter the Number to Insert");
        int no = sc.nextInt();
        System.out.println("Enter the Index you want to replace");
        int index = sc.nextInt();

        for(int i=n;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=no;
        System.out.println("New Array after insertion is: "+Arrays.toString(a));
        sc.close();
    }
}
