import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOStream {
    
    public static void main(String[] args)  throws Exception{

        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');
        bos.write('e');

        bos.writeTo(new FileOutputStream("D:\\Coll\\bos.txt"));// now the chracters are stored in the file

        /*byte b[] = bos.toByteArray();

        for(byte x: b ){
            System.out.print((char)x+" "); // typecasting is dont bcz it will result ascii code in byte 
        }*/
        bos.close();
    }
}
