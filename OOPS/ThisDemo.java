/*  This keyword to invoke current class instance variable
public class ThisDemo {
    String name;
    int age;
    String email;

    void setValue(String name,int age){
        this.name=name;
        this.age=age;
}
    void show(){
        System.out.println(name);
        System.out.println(age);
}

    public static void main(String[] args) {
        ThisDemo td= new ThisDemo(null, 0, null);
        td.setValue("Saquib", 24); // if we dont use this keyword then it will print null and 0.
        td.show();
    }

    public ThisDemo(String name,int age,String email){ // constructor of class is made
        //  name=name;   instance variable and local variable name is same  .Therefore "This" keyword is used.
        this.name=name;
        this.age=age;
        this.email=email;
        
    }
}
*/



/* This keyword to invoke current class method(implicitly)

public class ThisDemo{

    void display(){
        System.out.println("Hello");
    }
    void show(){
        this.display(); // id we dont add this keyword then compiler will automatically add this keyword
    }
    public static void main(String[] args) {
            ThisDemo td= new ThisDemo();
            td.show();
    }
}
*/ 





/* This keyword to invoke current class Constructor.

public class ThisDemo{
    ThisDemo(){
        this(30);  //first Parameterized Constructor will show as output and then No Arg
        System.out.println("No Arg Constructor");
     }
    ThisDemo(int a){
        System.out.println("Parameterized Constructor");
     }

     public static void main(String[] args) {
        ThisDemo td= new ThisDemo();
     }
}
*/




/*This keyword to pass as an argument in method call 

public class ThisDemo{

    void m1(ThisDemo td){  // method m1 with parameter as Reference of current class
        System.out.println("Method 1");
    }
    void m2(){
        m1(this);
    }
    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.m2();
    }
}
*/




/*This keyword to pass as an argument in constructor call */

class Test{
    Test(ThisDemo td){
        System.out.println("Test Class Constructor");
    }
}
public class ThisDemo{
    void m1(ThisDemo td){
        Test t = new Test(this);
    }
    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.m1(td);
    }


}
