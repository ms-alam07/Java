import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        }
        ; // InitialCapacity,LoadingFactor,AcessOrder

        lhm.put(1, "A"); // this one is accessed most recenlt so printed last
        lhm.put(2, "B");
        lhm.put(3, "C");// this will be printed first 
        lhm.put(4, "D"); // second
        lhm.put(5, "E");

        String s= lhm.get(2);
        s= lhm.get(5);
        s=lhm.get(1);
        lhm.put(6, "F");// as we have restricted the size so element leaast use will be removed as there are 6 elements in the hash table.

        lhm.forEach((x,y)->System.out.println(x+" "+y));
    }
}
