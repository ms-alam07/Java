import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyIOsStream {

    public static void main(String[] args) throws  Exception {
        
        FileInputStream fis = new FileInputStream("D:/Coll/copy1.txt");
        FileOutputStream fos =new FileOutputStream("D:/Coll/copy2.txt");

        int b;
        while((b= fis.read()) != -1){
            if(b>=65 && b<= 90 )fos.write(b+32);
            else fos.write(b);
        }
        fis.close();
        fos.close();

    }
}
