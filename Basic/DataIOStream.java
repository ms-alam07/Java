import java.io.*;

class student{
    int rollno;
    String name;
    String dept;
}
public class DataIOStream {
    public static void main(String[] args) throws Exception {

        //FOR READING THE DATA
        FileInputStream fis = new FileInputStream("D:/Coll/Student2.txt");
        DataInputStream d= new DataInputStream(fis);
        student s= new student();

        s.rollno=d.readInt();
        s.name =d.readUTF();
        s.dept =d.readUTF();
        System.out.println(s.rollno+" "+s.name+" "+s.dept);
        fis.close();d.close();


        //FOR WRITING THE DATA

        /*FileOutputStream fos = new FileOutputStream("D:/Coll/Student2.txt");
        DataOutputStream d= new DataOutputStream(fos);

        student s= new student();
        s.rollno =10;
        s.name ="Aadi";
        s.dept ="Engg";

        d.writeInt(s.rollno);
        d.writeUTF(s.name);
        d.writeUTF(s.dept);
        fos.close();d.close();*/
    }
}
