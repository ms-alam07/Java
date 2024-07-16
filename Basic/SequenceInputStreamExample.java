import java.io.*;

public class SequenceInputStreamExample {
    
    public static void main(String[] args)throws Exception{
        
        FileInputStream fis1 = new FileInputStream("D:/Coll/copy1.txt");
        FileInputStream fis2 = new FileInputStream("D:/Coll/copy2.txt");

        FileOutputStream fos = new FileOutputStream("D:/Coll/paste.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

         int b;
         while((b = sis.read()) != -1){
            fos.write(b);
         }
         fis1.close();
         fis2.close();
         fos.close();
    }
}
