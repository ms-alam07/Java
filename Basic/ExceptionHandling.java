

public class ExceptionHandling{
    public static void main(String[] args) {
        
        try{
            int a=10;
            int b =0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Division by Error (Try any number where the denominator is not zero");
        }
        System.out.println("Bye Bye");
    }

}