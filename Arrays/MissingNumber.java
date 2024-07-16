// Write a java program to find the missing nnumber.

public class MissingNumber {
    
    public static void main(String[] args) {
        int a[]= {1,2,3,4,6,7};
        int n = a.length;

        int expectedSum = (n*(n+1)/2);
        int actualSum = 0;
        
        for(int i=0;i<n-1;i++){
            actualSum = actualSum+ a[i];
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number is: "+missingNumber);

    }
}
