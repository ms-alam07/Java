// Write a java program to sort a numeric array and a string array.

import java.util.*;
public class SortNumStringArray {

    public static void main(String[] args) {
        
    int a[]={6,8,54,96,7,8,23,5,57,89,73,67,63,13,92};

    String b[]={"Java","Python","PHP","C#","C Programming","C++"};

    System.out.println("Original Numeric Array: "+ Arrays.toString(a)); // directly printing the array
    Arrays.sort(a);
    System.out.println("Sorted Numeric Array "+Arrays.toString(a));

    System.out.println("Original String Array: "+Arrays.toString(b));
    Arrays.sort(b);
    System.out.println("Sorted String Array: "+Arrays.toString(b));
    }
    
}
