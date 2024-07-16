// Write a java program to find the common elements between two Arrays(String values).

import java.util.*;
public class CommonStringElements {

    public static void main(String[] args) {
        String s1[]={"Aadi","Ash","Saquib","Alam","Ashu"};
        String s2[]={"Ash","Aadi","ms","msa","Ashly"};
        List<String> ans = common(s1, s2);
        
        if (ans.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements between the two arrays are: " + ans);
        }
    }
    
    public static List<String> common(String[] s1,String[] s2){
        List<String> ans = new ArrayList<>();
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s1[i].equals(s2[j])){
                    ans.add(s1[i]);
                }
            }
        }
        return ans;
    }
}
