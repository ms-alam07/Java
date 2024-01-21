import java.lang.*;
import java.util.*;


class Animal{
    void walk(){
        System.out.println("The Animal is Walking");
    }
}

public class Basics{

    public void eat(){
        System.out.println("The Animal is Eating");
    }

    public void run(){
        System.out.println("The Animal is Running");
    }
    public static void main(String[] args) {

        Basics a= new Basics();
        Animal aa = new Animal();
        

        a.eat();
        a.run();
        
    }
}