public class NestedExcetion {
    
    public static void main(String[] args) {
        
        int a[] ={30,10,20,60,0};
        try{
            int c= a[1]/a[2];
            System.out.println("Division is:"+c);
            try{
                System.out.println(a[6]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Index");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Division by Error");
        }
        System.out.println("Bye");

    }
}
