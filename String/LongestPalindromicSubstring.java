// Write a Java program to find the longest Palindromic Substring within a string.

public class LongestPalindromicSubstring{
    public static void main(String[] args) {
        String s = "thequickbrownfoxxofnworbquickthe";
        String ans = LongestPalindromic(s);
        System.out.println("Longest Palindromic Substring is: "+ans);
        System.out.println("Length of Substring is: "+ans.length());

    }


    public static String  LongestPalindromic(String s){
        if(s.isEmpty() || s== null){
            return "";
        }
         return helper(s, 0, s.length()-1);
    }


    public static String helper(String s,int l,int r){
        if (l >= r) {
            return "";
        }
        
        if (s.charAt(l) == s.charAt(r)) {
            String cur = helper(s, l + 1, r - 1);
            // If the substring inside the current l and r is a palindrome
            if (cur.length() == r - l - 1) {
                return s.substring(l, r + 1);
            }
        }
        String pal1 = helper(s, l, r - 1);
        String pal2 = helper(s, l + 1, r);
        
        // Return the longest palindrome between the two
        if(pal1.length()>pal2.length()){
            return pal1;
        }
        else{
            return pal2;
        }

    }

}