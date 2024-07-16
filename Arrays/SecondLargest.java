// Write a program to find the second largest element in the array.

public class SecondLargest {
    public static void main(String[] args) {
        
        int  a[]={9,6,12,18,5,24,25};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        //Another way would be sorting the array till the 1st index using for loop(for loop) --O(N2)
        for(int i=0;i<a.length;i++){
            if(a[i]> max1){
                max2 = max1;
                max1 =a[i];
            }
            else if(a[i]>max2 && a[i]!=max1){
                max2 = a[i];
            }
        }
        System.out.println("The Second Largest Element is "+max2);
    }
}
