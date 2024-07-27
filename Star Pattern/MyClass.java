public class MyClass {
    int x=10;
  public static void main(String args[]) {
      
      try{
    int z =10/0;
    MyClass m= null;
    System.out.println(m.x);
}
catch( Exception e){
    e.printStackTrace();
}
    
    System.out.println("Welcome");
  }
}