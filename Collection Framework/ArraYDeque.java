import java.util.ArrayDeque;

public class ArraYDeque {
    
    public static void main(String[] args) {
        
        ArrayDeque<Integer> q1= new ArrayDeque<>();
        

        q1.offerFirst(30);
        q1.offerLast(40);// at the last
        q1.offerLast(50);
        q1.offerLast(60);
        q1.addLast(70); // this will be new last element
        q1.poll(); //will delete the first element
        q1.pollLast(); // will delete the last element
        q1.remove(); // will delete first element
        System.out.println("The First Element is: "+q1.peek()); // retrieve the first element

        q1.forEach((x)->System.out.println(x));
    }
}
