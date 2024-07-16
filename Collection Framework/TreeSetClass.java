import java.util.*;
// **COMPARABLE INTERFACE**
class Point implements Comparable {
    int x;
    int y;
    
    public Point(int x,int y){  
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "x="+x+"y="+y;
    }

    public int compareTo(Object o){
        Point p =(Point)o;
        if(this.x < p.x) return -1;
        else if(this.x>p.x) return 1;
        else{
            if(this.y<p.y) return -1;
            else if(this.y>p.y) return 1;
            else return 0;
        }
    }
}

public class TreeSetClass{
    public static void main(String[] args) {

        TreeSet<Point> ts = new TreeSet<>();

        ts.add(new Point(1, 2));
        ts.add(new Point(2, 2));
        ts.add(new Point(2, 3));
        ts.add(new Point(3, 4));
        ts.add(new Point(3, 2));
        System.out.println(ts);

        //ts.forEach((s)->System.out.println(s));


         /*TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,50,10));
         ts.add(25);
         ts.forEach((x)->System.out.println(x));

         System.out.println(ts.ceiling(35)); // return closest no near to 55
         System.out.println(ts.floor(45));*/
    }

}