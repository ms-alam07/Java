

public class ReverseWords {

    public static void main(String[] args) {

        String ss = reverseWords("hello world");
        System.out.println(ss);
        
    }

    static String reverseWords(String s){
        String [] words = s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    // static String reverseWords(String s){
    //     List<String> str = new ArrayList<>(Arrays.asList(s.split(" ")));
    //     Collections.reverse(str);
    //     return  String.join(" ",str);
    // }
    
}
