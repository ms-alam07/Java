// Write a java program to convert an ArrayList into Array.

import java.util.*;
public class ArrayListToArrayConversion {
    
    public static void main(String[] args) {
        
        List<Integer> ans = new ArrayList<>();

        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(5);
        ans.add(6);

        Integer a[]= new Integer[ans.size()];
        ans.toArray(a);
        System.out.println(Arrays.toString(a));
    }
}
