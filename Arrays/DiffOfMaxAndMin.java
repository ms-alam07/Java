// Write a java program to find the difference between largest and smallest values in an array of integers.

public class DiffOfMaxAndMin {
    public static void main(String[] args) {
        
        int a[]= {2,7,5,9,13,16};
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
        max = Math.max(max, a[i]);
        min = Math.min(min, a[i]);
        }
        int difference = max-min;

        System.out.println("The difference between largest and smallest vlaue in an array is: "+difference);
}
}
