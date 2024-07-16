import java.io.*;

class student implements Serializable{ // class should implement serializable to read the data
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int data=10; // static members are not serialized
    public transient int t; // transient members are not serialized

    public student(){} // a non parameterized constructor 

    public student(int r,String n,float a,String d){
        rollno =r;
        name =n;
        avg =a;
        dept=d;
        data =500;
        t=500;
    }
    public String toString(){
    return "\n Student Details\n"+
           "\n RollNo"+ rollno+
           "\n Name"+name+
           "\n Average"+avg+
           "\n Department"+dept+
           "\n Data"+data+
           "\n Transient"+t+"\n";
}}

public class ObjectIOStream {
    public static void main(String[] args) throws Exception {

        //Writing the Data

        /*FileOutputStream fos= new FileOutputStream("D:/Coll/Student3.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        student s=  new student(01, "Ash", 73.4f, "CSE");
        student s2=  new student(01, "John", 83.4f, "ME");
        student s3=  new student(01, "Joy", 93.4f, "AIML");

        os.writeObject(s);
        os.writeObject(s2);
        os.writeObject(s3);

        fos.close();os.close();*/

        //Reading the Data

        FileInputStream fis = new FileInputStream("D:/Coll/Student3.txt");
        ObjectInputStream is = new ObjectInputStream(fis);

        student s=(student)is.readObject();
        student s2=(student)is.readObject();
        student s3=(student)is.readObject();

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        fis.close();is.close();
    }
}