// Write a java porgram ot find all the interleavings of given string.


public class Interleavings {

    public static void main(String[] args) {
        String s1 = "WX";
        String s2 = "YZ";
        System.out.println("Interleavings are: ");
        printInterleavings(s1, s2, "", 0, 0);
        
    }

    public static void printInterleavings(String s1,String s2,String cur,int i,int j){
        if(i== s1.length() && j==  s2.length()){
            System.out.println(cur);
            return;
        }

        if(i<s1.length()){
            printInterleavings(s1, s2, cur+s1.charAt(i), i+1, j);
        }
        if(j<s2.length()){
            printInterleavings(s1, s2, cur+s2.charAt(j), i, j+1);
        }
    }
    
}
