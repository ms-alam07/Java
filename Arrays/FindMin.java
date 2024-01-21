// Write a program to find the smallest number in an array element.

public class FindMin {
    public static void main(String[] args) {
        
        int numbers[]={23,2,46,69,54};
        int min=100;
        for(int i=0;i<numbers.length;i++){
            min = Math.min(min, numbers[i]);
    }System.out.println("Minimum Number is"+min);


    }
}
