// A FileWriter Class is used to write Charcater-Oriented data to a file.

import java.io.FileWriter;

public class FileWriterClass {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\Saquib\\Desktop\\Projects\\Lang\\Java Basics\\Basic\\A.txt",true);
            fw.write("\n");
            fw.write("Md Saquib Alam");
            fw.write("\n");
            fw.write(97);
            fw.close(); // Important to close the file .Then only write method will work
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
