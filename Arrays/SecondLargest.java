// Write a program to find the second largest element in the array.

public class SecondLargest {
    public static void main(String[] args) {
        
        int  a[]={9,6,12,18,5,25};
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]> max1){
                max2 = max1;
                max1 =a[i];
            }
            else if(a[i]>max2 && a[i]<max1){
                max2 = a[i];
            }
        }
        System.out.println("The Second Largest Element is "+max2);
    }
}
