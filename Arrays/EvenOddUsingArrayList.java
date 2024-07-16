import java.util.*;
public class EvenOddUsingArrayList {
    public static void main(String[] args) {
        int a[]={2,6,3,9,8,1};

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                a1.add(a[i]);
            }
            else{
                a2.add(a[i]);
            }
        }
        System.out.println("Even Numbers are: ");
        for(int e:a1){
            System.out.println(e);
        }
        System.out.println("Odd Numbers are: ");
        for(int f:a2){
            System.out.println(f);
        }
        System.out.println("Counting the no of even numbers"+a1.size());
        System.out.println("Counting the no of odd numbers"+a2.size());
    }
}
