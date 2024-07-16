// Write a program to find the sum of all elements in an array.

import java.util.*;
public class ArraySum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int numbers[]={10,15,20,25,30};

        int sum=0;
        for(int num : numbers){
            sum+=num;  /*sum=sum+num; */
        }
        System.out.println("Sum is "+sum);
        sc.close();
    }
    
}
