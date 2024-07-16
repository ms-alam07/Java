// Write a program to find the largest number in an array element.

public class FindMax {
    public static void main(String[] args) {
        
        int numbers[]={2,8,34,67,86,90};
        int max=0;

        for(int i=0;i<numbers.length;i++){
        if(numbers[i]>max){
            max=numbers[i];
        }
        }
         System.out.println("The largest no is : "+max);
    }
}
