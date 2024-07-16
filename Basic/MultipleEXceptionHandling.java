public class MultipleEXceptionHandling {
    
    public static void main(String[] args) {
        
        int a []= {10,20,60,70,0};

        try{
            int c= a[2]/a[1];
            //int d= a[0]/a[4]; // exception here(division by error)
            //System.out.println(d);
            System.out.println(c);
            System.out.println(a[10]); // exception here(index)
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is Invalid");
        }
        System.out.println("Bye");
    }
}
