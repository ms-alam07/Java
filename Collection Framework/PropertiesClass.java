import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args)throws Exception {
        
        Properties p = new Properties();

        //** WRITING THE DATA INTO FILE OR XML**

        /*p.setProperty("Brand", "HP");
        p.setProperty("Processor", "Intel i7");
        p.setProperty("OS", "Windows 10");
        p.setProperty("Model", "Pavilion");
        System.out.println(p);
        p.store(new FileOutputStream("D:/Coll/Properties.txt"), "Laptop"); // save the properties into a any file using FileOutputStream

        p.storeToXML(new FileOutputStream("D:/Coll/Properties.xml"), "Laptop"); // save the properties into a any XML file using FileOutputStream
        */

        //** READING THE DATA FROM XML FILE**

        p.loadFromXML(new FileInputStream("D:/Coll/Properties.xml"));
        System.out.println(p);
    }
}
