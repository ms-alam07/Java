// StringBuilder Class Constructor and Methods.

public class StringBuilderClassDemo {
    public static void main(String[] args) {

        // Constructors
        
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(/*CharSequence seq */);
        StringBuffer sb2 = new StringBuffer("Saquib"/*String s */);
        StringBuffer sb3 = new StringBuffer(/*Int Capacity */);


        //Methods

// Capacity Method
System.out.println("Capacity is : "+sb2.capacity()); /*original:16 +capacity*/


// Append Method
sb2.append("mlndvjnvdknvonVbosjdbmlCBjbSJFbjoHnjoAlam");
System.out.println("New String is :"+sb2);
System.out.println(sb2.capacity());


// Insert Method
sb2.insert(0,"Hello -->");   // insert from the given index
System.out.println("New String After Insert Method :"+sb2);


// Replace Method
sb2.replace(9, sb2.length()-4, " me.aadi07"); // replace from given indeces 
System.out.println("String after Replace method : "+sb2);


// Delete Method
sb2.delete(19, sb2.length()); // delete from given indeces
System.out.println("String after Delete method : "+sb2);


// Reverse Method
sb2.reverse();
System.out.println("String after Reverse method : "+sb2);






    }
    
}
