import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Saquib\\Desktop\\Projects\\Lang\\Java Basics\\Basic\\file.ser");
            ObjectInputStream ois = new  ObjectInputStream(fis);
            SerializationDemo sd = (SerializationDemo)ois.readObject(); // Here child object is used
            fis.close();
            ois.close();
            System.out.println(sd.name);
            System.out.println(sd.password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
