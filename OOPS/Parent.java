public class Parent extends Child {


    public static void main(String[] args) {

        Child c= new Child();
        c.display();
        
    }

   
}

class Child {
     void display(){
        System.out.println("Hello");
    }
}
