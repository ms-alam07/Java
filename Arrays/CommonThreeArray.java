// Write a java program to find the common elements in three sorted arrays.

import java.util.*;
public class CommonThreeArray {
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={2,4,6,8,10,12};
        int c[]={3,6,9,12,15,18};

        List<Integer> ans = common(a, b, c);

        if (ans.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements between the two arrays are: " + ans);
        }
    }

    public static List<Integer> common(int a[],int b[],int c[]){
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<c.length;k++){
                    if(a[i] == b[j] && a[i]== c[k] && b[j]== c[k]){
                        ans.add(a[i]);
                    }
                }
            }
        }
        return ans;
    }
}
