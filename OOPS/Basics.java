
class Animal{ // class 
    void walk(){ // method
        System.out.println("The Animal is Walking");
    }
}

public  class Basics{ String name;
    int age;

    public static void eat(){ // static method( can be directly called without creating object of class)
        System.out.println("The Animal is Eating");
    }

    public void run(){ // for calling this method inside main we need to create the object first
        System.out.println("The Animal is Running");
    }
    public static void main(String[] args) {

        Basics a= new Basics(); // object of Basics is declared and created to use methods
        Animal aa = new Animal();
        

        eat(); // directly we can call the method without creating any object as the method is static
        a.run();
        aa.walk();

        
    }
}