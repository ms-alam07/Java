// Write a program for searching an element in an array.

import java.util.*;
public class SearchingElement {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int a[]={6,12,18,24,30,36};
        System.out.println("Enter the key");        
        int key =sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(key==a[i]){
                System.out.println("Element found at "+ i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
        sc.close();
    }
}
