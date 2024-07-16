// Write a java program to reverse the String.

public class ReverseString {
    
    public static void main(String[] args) {
        
        String s = "mada";
        String reversed = reverse(s);
        System.out.println("Original String is :"+s);
        System.out.println("Reversed String is :"+reversed);
        
        }

        public static String reverse(String s){

        char c[]=s.toCharArray();
        int l=0;
        int r = s.length()-1;

        while(l<r){
            char temp = c[l];
            c[l] = c[r];
            c[r] = temp;

            l++;
            r--;
        }
        return new  String(c);
    }
    }