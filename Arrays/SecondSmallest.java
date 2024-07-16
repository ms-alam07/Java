// Write a program to find the second smallest element in an array.

public class SecondSmallest {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6};
        int n = a.length;
        int min1 =Integer.MAX_VALUE;
        int min2 =Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]<min1){
                min2 = min1;
                min1=a[i];
            }
            else if(a[i]<min2 && a[i]!=min1){
                min2=a[i];
            }
        }
        System.out.println("Second Smallest Element is: "+min2);
    }
}
