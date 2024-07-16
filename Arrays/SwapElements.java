// Write a program to swap two number in an array.

public class SwapElements {
    public static void main(String[] args) {
        
        int a[]={2,9,13,27,39};
        int i=1,j=3;

        int temp =a[i];
        a[i]=a[j];
        a[j]=temp;

        for(int x:a){
            System.out.print(x+" ");
        }
    }
}
