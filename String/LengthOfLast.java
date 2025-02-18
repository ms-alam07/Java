public class LengthOfLast {

    public static void main(String[] args) {
        int length = LengthOfLastWord("Hello World");
        System.out.println("The Length of last word World is:" + length );
        
    }

    static int LengthOfLastWord(String s){

        String str= s.trim();
        int count =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
    
}
