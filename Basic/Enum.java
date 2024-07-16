enum dept{
    cs,ise,civil,mech;
}

public class Enum {
    public static void main(String[] args) {
        
        // dept d = dept.cs;(object of dept is created)
        dept list[] = dept.values();
        for(dept i :list){
            System.out.print(i+" ");
        }
        System.out.println(dept.valueOf("cs"));
        
    }
}
 