@FunctionalInterface
interface lambda{
    public void display(String s);// lambda expression with parameters
}
/*class lambdaexp implements lambda{
    public void display(){
        System.out.println("Hello World");
    }
}  */

public class LambdaExpression{
    public static void main(String[] args) {
        lambda l =(s)->{System.out.println(s);};
        l.display("Hello World");
    }
}