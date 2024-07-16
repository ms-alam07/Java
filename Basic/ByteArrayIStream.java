import java.io.ByteArrayInputStream;

public class ByteArrayIStream {
    
    public static void main(String[] args) throws Exception { // EXCEPTION SHOULD BE HANDLED
        
        byte b[]={'a','b','c','d','e','f'};

        ByteArrayInputStream bis = new ByteArrayInputStream(b);// OBJECT OF BYTE ARRYA IS CREATED

        // ANOTHER WAY
        String s = new String(bis.readAllBytes());
        System.out.print(s+" ");
                            //OR
        int x;
        while((x=bis.read())!=-1){ // X WILL READ UNTILL -1 IS FOUND 
            System.out.print((char)x+" "); // CHAR TYPECASTING
        }

        
        bis.close();
    }
}
