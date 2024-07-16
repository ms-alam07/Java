// Write a java porgram to convert an Array in ArrayList

import java.util.*;

public class ArrayToArrayListConversion {
    public static void main(String[] args) {
         int a []={1,2,3,4,5};
         ArrayList<Integer> list = new ArrayList<>();
        for( int x: a){
            list.add(x);
        }
        System.out.println(list);
    }
    
}
