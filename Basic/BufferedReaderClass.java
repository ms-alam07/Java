// BufferedReader Class is used to provie buffered reading from the file.

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderClass {
    public static void main(String[] args) {
        try {
            FileReader fw = new FileReader("C:\\Users\\Saquib\\Desktop\\Projects\\Lang\\Java Basics\\Basic\\B.txt");
            BufferedReader br = new BufferedReader(fw);
            System.out.println(br.readLine());
            System.out.println(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
