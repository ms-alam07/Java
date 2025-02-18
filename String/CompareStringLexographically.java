// Write a Java program to compare two strings lexicographically.

public class CompareStringLexographically {
    
    public static void main(String[] args) {
        
        String s1 ="This is String 2";
        String s2 ="This is String 1";

        int ans = s1.compareTo(s2);

        if(ans<0){
            System.out.println("s1 is lesser than s2");
        }
        else if(ans == 0){
            System.out.println("s1 is equal to s2");
        }
        else{
            System.out.println("s1 is greater than s2");
        }
    }
    
}
