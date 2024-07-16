
public class WrapperClass {
    public static void main(String[] args) {
        
        Integer j = Integer.valueOf(10);// autoboxing
        Integer k = 10; // autoboxing
        int a= j;  // unboxing


        int m1= 15;
        Integer m2 = m1;
        Integer m3=15;
        System.out.println(m2.equals(m3));
        Integer m4=Integer.valueOf("20");
        System.out.println(Integer.parseInt("222")); // convert string to int
        System.out.println(Integer.toBinaryString(40));


        float p= 12.5f; // primitive float type
        Float q = 12.5f; // object of float type
        System.out.println(q.equals(q));

        Float s = 12.5f/0;
        Float r = -12.5f/0;
        System.out.println(r== Float.POSITIVE_INFINITY);
        
        Float x= (float)Math.sqrt(9); // typecasting in float 
        System.out.println(x.isNaN()); // is Not a Number


        
    }
}
