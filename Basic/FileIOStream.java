import java.io.FileInputStream;

public class FileIOStream {
    
    public static void main(String[] args) throws Exception {

    // File InputStream

        FileInputStream fis = new FileInputStream("D:/Coll/Test.txt");
        byte b[]= new byte[fis.available()];
        fis.read(b);
        String s = new String(b);
        System.out.println(s);
        fis.close();

        /*  File OuputStream

            FileOutputStream fos = new FileOutputStream("D:/Coll/Test.txt");
            String s= "Java Programming";
            //fos.write(s.getBytes());  // to get the array of bytes
            byte b[] = s.getBytes();
            for(byte x : b)
            System.out.print(x+" ");
            fos.close();  
        */
    }
}
