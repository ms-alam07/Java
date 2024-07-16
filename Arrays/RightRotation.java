// Write a program to right rotate the given array element.

public class RightRotation {
    public static void main(String[] args) {
        
        int a[] = {7,15,6,18,9,13};

        int temp = a[a.length-1];

        for(int x:a){
            System.out.print(x+" ");
            System.out.println("");
        }
        for(int i=a.length-1;i>0;i--){
            a[i+1]=a[i];
        }
        a[0]=temp;

        for(int x:a){
            System.out.print(x+" ");
    }
    
}
}
