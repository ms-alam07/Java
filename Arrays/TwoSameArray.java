// Write a java program to test two arrays equality.

public class TwoSameArray {
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        int b[] ={1,2,3,4};
        
        System.out.println(same(a, b));
        
    }
    public static boolean same(int a[],int b[]){
        if(a.length == b.length) {
            for(int i=0;i<a.length;){
                if(a[i] == b[i]){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
}
