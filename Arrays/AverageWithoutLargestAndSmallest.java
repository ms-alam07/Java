// Write a java porgram to compute the average value of an array of integers except the largest and smallest value.

public class AverageWithoutLargestAndSmallest {
    
    public static void main(String[] args) {
        
        int a[]={5,2,7,86,18};
        int  n = a.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int sum=0;
        
        for(int i=0;i<n;i++){
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);

            sum = sum+a[i];
        }
        float avg=(float)(( sum - max - min )/(n-2));// Here Typecasting is done bcz we are dividing it by an integer.
        System.out.println("Largest Element is: "+max);
        System.out.println("Smallest Element is: "+min);

        System.out.println("The Average Value is: "+avg);
}
}
