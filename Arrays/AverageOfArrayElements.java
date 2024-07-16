// Write a java program to find the average of arrasy of elements.

public class AverageOfArrayElements {
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int sum=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        float Average = sum/a.length;
        System.out.println(Average);

    }
}
