public class HaystackNeedle {
    public static void main(String[] args) {
        
    }
    
    static int indexOfFirstOccurance(String haystack, String needle){
        if(needle.isEmpty()) return 0;
        int h = haystack.length(), n = needle.length();

        for (int i = 0; i <= h-n; i++) {
            if(haystack.substring(i, i+n).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
