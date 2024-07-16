import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) throws Exception{

        FileInputStream fis = new FileInputStream("D:/Coll/Properties.txt");
        byte b[]= new byte[fis.available()]; // creating a byte array and loading data into file
        fis.read(b);

        String data = new String(b);

         //String data ="Name=Aadi;Age=24;Dept=CSE";

         StringTokenizer stk = new StringTokenizer(data,"="); // delimeter are "=;"
         String s;
          while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
          }
          fis.close();
    }
}
