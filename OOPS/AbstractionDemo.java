// NOTE: Abstraction can be acheived by two ways: Abstract class,Interface.

public class AbstractionDemo extends Demo {
    public void show(){ // Any class inherting properties of abstract class then all the abstrat methods in class should be overrided.

    }
    
}
abstract class Demo{
    // void Demo(){}  // Constructor of Abstract Class is Possible.
    public abstract void show(); // abstract method
    void display(){ // An Abstract Class can hav concrete Methods
        System.out.println();
    }
}
