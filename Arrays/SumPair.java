// Write a java program to find all pairs  of elements in an array whose sum is equal ot a specified number.

import java.util.*;

public class SumPair {

    public static void main(String[] args) {
        int[] a = {2, 7, 4, -5, 11, 5, 20};
        int targetSum = 15;
        ArrayList<ArrayList<Integer>> pairs = pair(a, targetSum);
        for (ArrayList<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }

    public static ArrayList<ArrayList<Integer>> pair(int[] a, int targetSum) {

        ArrayList<Integer> cur = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(a, targetSum, 0, cur, result);
        return result;
    }

    public static void helper(int[] a, int targetSum, int index, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> result) {

        if (targetSum == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }

        if (index >= a.length || targetSum < 0) return;
        
        cur.add(a[index]);
        helper(a, targetSum - a[index], index + 1, cur, result);

        cur.remove(cur.size() - 1);
        helper(a, targetSum, index + 1, cur, result);
    }
}