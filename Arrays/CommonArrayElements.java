// Write a java progrma to find common elements between two integer arrays.

import java.util.*;
public class CommonArrayElements {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12};
        int b[]={3,6,9,12,15};

        List<Integer> ans = common(a,b);
        
        if (ans.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements between the two arrays are: " + ans);
        }
        
    }

    public static List<Integer> common(int a[],int b[]){
        List<Integer>  ans = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]== b[j]){
                    ans.add(a[i]);
                }
            }
        }
        return ans;
    }
}
