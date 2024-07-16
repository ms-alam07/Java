// Write a program to count letters, spaces, numbers and other characters in an input string.

public class CountCharacters{
    public static void main(String[] args) {

        String str ="Hello A@di! How are you?";
        count(str);
        
    }

    public static void count(String str){
        char[] words = str.toCharArray();

        int letters=0;
        int spaces=0;
        int numbers=0;
        int others=0;

        for(int i=0;i<words.length;i++){
            if(Character.isLetter(words[i])){ // here we have used Character class 
                letters++;
            }
            else if(Character.isDigit(words[i])){
                numbers++;
            }
            else if(Character.isWhitespace(words[i])){
                spaces++;
            }
            else{
                others++;
            }
        }
        System.out.println("Letters are: "+letters);
        System.out.println("Numbers are: "+numbers);
        System.out.println("Spaces are: "+spaces);
        System.out.println("Others are: "+others);
    } 
}