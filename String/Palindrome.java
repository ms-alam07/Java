// Write a java program to find whether the given string is Palindrome or not.

public class Palindrome {
    
    public static void main(String[] args) {
        String s ="madam";
        boolean ans = helper(s, 0, s.length()-1);
        System.out.println(ans);
      }

    public static boolean helper(String s,int l,int r){
        if(l>=r) return true;
        
        if(s.charAt(l)== s.charAt(r)){
            return helper(s, l+1, r-1);
        }
        else return false;
    }
}
