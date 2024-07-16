public class InheritanceDemo {
    void showA(){
        System.out.println("this is parent class ");
    }
}
class Demmo extends InheritanceDemo {

    void showB(){
        System.out.println("this is child class");
    }
    
    public static void main(String[] args) {
         
        Demmo d = new Demmo();
        d.showA();     
        d.showB();     

    }
    
}
