import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo2 {
    public static void main(String[] args) {
        try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Saquib\\Desktop\\Projects\\Lang\\Java Basics\\Basic\\file.ser");
            SerializationDemo sd = new SerializationDemo();
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sd);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


// Continue with Desrialization
