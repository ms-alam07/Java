// Write a program to find the smallest number in an array element.

public class FindMin {
    public static void main(String[] args) {
        
        int numbers[]={23,2,46,69,54};
        int min=numbers[0];
        for(int i=1;i<numbers.length;i++){
           if(numbers[i]<min){
            min=numbers[i];
           }
    }System.out.println("Minimum Number is : "+min);


    }
}
