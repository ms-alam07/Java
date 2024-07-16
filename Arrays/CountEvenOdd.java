// Write a java program to find the number of even and odd integers in a given array of integers.

public class CountEvenOdd {
    
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,8,9};
        int n = a.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(a[i]%2 ==0){
                count++;
            }
        }

        System.out.println("No of even numbers are: "+count);
        System.out.println("No of odd numbers are: "+(n-count));
    }
}
