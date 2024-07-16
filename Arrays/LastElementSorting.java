// Write a program to place the last number in the sorted position in an array.

public class LastElementSorting {
    public static void main(String[] args) {
        
        int a[]={2,5,8,9,4};

        for(int x:a){
            System.out.print(x+" ");
            System.out.println("");
        }
        
        int n=a.length;    /*n=5 */
        int last=a[n-1];
        int swapindex =n-2;

        while(swapindex>=0 && a[swapindex]>last){
            swapindex--;
        }

        for(int i=n-1;i>=swapindex+2;i--){    /*swapindex becomes n+2 because swapindex is zero */
            a[i]=a[i-1];
        }
        a[swapindex+1]=last;

        for(int x:a){
            System.out.print(x+" ");
            
        }
    }
}
