public class MethodOverriding extends Overriding {
     void display(){  /*same method name with different class using inheritance */
        System.out.println("1");
     }

     public static void main(String[] args) {
        MethodOverriding mo= new MethodOverriding();
        mo.display();
        
        
        Overriding or= new Overriding();
        or.display();
     }
}

class Overriding{
    void display(){   /*same method name with different class using inheritance */
        System.out.println("2");
    }
}
