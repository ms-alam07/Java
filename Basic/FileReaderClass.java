// A FileReader Class in java is used to read the data from the file in "Character-Oriented".

import java.io.*;

public class FileReaderClass {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Saquib\\Desktop\\Projects\\Lang\\Java Basics\\Basic");
            FileReader fr = new FileReader(f);

            for(int i=0;i<f.length();i++){
                System.out.println((char)fr.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
