import java.io.File;
import java.io.FileOutputStream;

public class FileIOStreamExample {
    
    public static void main(String[] args) throws Exception {
        
        File f = new File("D:/Coll/Data.txt");
        //f.setReadOnly(); // access will be denied
        f.setWritable(true);
        FileOutputStream fos = new FileOutputStream("D:/Coll/Data.txt");

        /*File f = new File("D:/Coll");
        System.out.println(f.isDirectory());
        File list[]= f.listFiles();

        for(File x:list){
            System.out.print(x.getName()+" ");
            System.out.println(x.getPath());
        }*/
        fos.close();


    }
}
