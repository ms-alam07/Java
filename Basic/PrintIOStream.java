import java.io.*;
class student{
    int rollno;
    String name;
    String dept;
}
public class PrintIOStream {
    public static void main(String[] args) throws Exception {

        //FOR READING THE DATA
        /*FileInputStream fis = new FileInputStream("D:/Coll/Student1.txt");
        BufferedReader br= new BufferedReader(new InputStreamReader(fis));

        student s= new student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();

        System.out.println(s.rollno+" "+s.name+" "+s.dept);
        fis.close();;
        br.close();*/

        // FOR WRITING THE DATA

        FileOutputStream fos = new FileOutputStream("D:/Coll/Student1.txt");;
        PrintStream ps = new PrintStream(fos);

        student s= new student();
        s.rollno=10;
        s.name="john";
        s.dept="CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        fos.close();ps.close();
    }
}
