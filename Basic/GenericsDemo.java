public class GenericsDemo<T> {
    T data[]= (T[]) new Object[3]; // TYPECASTING

    public static void main(String[] args) {
         GenericsDemo<String> s = new GenericsDemo<String>();

         s.data[0]="Hi";
         s.data[1]="Hii";
         // s.data[2]=123; (Here integer value is stored in the string of array where the compiler will show error tht's the benefits of using  generics)

         String s1= s.data[0];
         String s2= s.data[1];
         String s3= s.data[2];

         System.out.println(s);
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
    }
    
}
