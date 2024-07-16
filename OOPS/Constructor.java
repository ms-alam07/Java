// Constructor is used for object initialization because by using reference variable or method it is not considered good programming techniques if we have large object initialization.
public class Constructor {

    String Name;
    int Age;
    int No;

    public Constructor( String Name,int Age,int No){ 
        // Here Parameterized Constructor is used to initialize the objects.

        this.Name=Name;
        this.Age=Age;
        this.No=No;

    }
    public static void main(String[] args) {

        Constructor c= new Constructor("Aadi", 23, 101);
        Constructor c2= new Constructor("Aadi2", 23, 102);
        Constructor c3= new Constructor("Aadi3", 23, 103);
        Constructor c4= new Constructor("Aadi4", 23, 104);
        Constructor c5= new Constructor("Aadi5", 23, 105);
        Constructor c6= new Constructor("Aadi6", 23, 106);
        System.out.println(c.Name+"  "+c.Age+" "+c.No);
        System.out.println(c2.Name+"  "+c2.Age+" "+c2.No);
        System.out.println(c3.Name+"  "+c3.Age+" "+" "+c3.No);
        System.out.println(c4.Name+c4.Age+c4.No);
        System.out.println(c5.Name+c5.Age+c5.No);
        System.out.println(c6.Name+c6.Age+c6.No);
        
    }
}
