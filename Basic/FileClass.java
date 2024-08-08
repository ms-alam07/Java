import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\Saquib\\Desktop\\Projects\\Lang\\Java Basics\\Basic\\B.txt");



        try {
            boolean val4 = f.createNewFile();
            System.out.println(val4);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    //     Boolean val= f.exists();

    //     Boolean val2 =f.delete();

    //     long val3= f.length();


    //     System.out.println(val);
    //     System.out.println(val2);
    //     System.out.println(val3);
    }
}
