// A BufferedWriter Class is used to provide buffering for writer instances.

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterClass {
    public static void main(String[] args) {
        try {
            FileWriter fw= new FileWriter("C:\\Users\\Saquib\\Desktop\\Projects\\Lang\\Java Basics\\Basic\\B.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(97);
            bw.newLine();
            bw.write("Md Saquib Alam");
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
