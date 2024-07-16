import java.util.*;

class MyCom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1<o1) return 1;
        if(o1>o1) return 1;
        return 0;
    }
}

public class PriorityQueueClass {    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> p1= new PriorityQueue<>(new MyCom()); // creating object of MyCom and passing as parameter
        p1.add(20);
        p1.add(10);
        p1.add(30);
        p1.add(5);
        p1.add(15);
        p1.add(3);
        p1.forEach((x)->System.out.println(x));

        p1.poll();
        System.out.println("After Deletion: ");
        p1.forEach((x)->System.out.println(x));
    }
}
