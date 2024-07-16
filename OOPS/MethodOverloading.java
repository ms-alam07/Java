public class MethodOverloading {

    void display(){   /*same method in same class with different arguments */
        System.out.println("1");
    }

    void display(int a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOverloading ml = new MethodOverloading();
        ml.display(10);  /*output 2 */
        ml.display();   /*output 1 */
    }
    
}
