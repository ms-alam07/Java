// Write a program to find the duplicate values in an array of integer values.

public class Duplicates {
    public static void main(String[] args) {
        //This can be solved using set and hash table.
        
        int a[]={1,2,3,4,5,6,4,3};
        int n = a.length;

        for(int i=0;i<n-1;i++){
            for(int j= i+1; j < n; j++){
                if(a[i]==a[j] && i != j){
                    System.out.println("Duplicate values are: "+a[j]);
                }
            }
        }
    }
}
