// You are given a 0-indexed array of strings words and a character x.Return an array of indices representing the words that contain the character x.

import java.util.ArrayList;
import java.util.List;

public class WordContainingChar {
    public static void main(String[] args) {
        WordContainingChar solution = new WordContainingChar();
        String[] words = {"apple", "banana", "orange", "kiwi"};
        char x = 'a';
        List<Integer> indices = solution.findWordsContaining(words, x);
        for (int index : indices) {
            System.out.print(index + " ");
        }
        // Output: 0 1 2
    }
    
     public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> ans = new ArrayList<>();

    for(int i=0;i<words.length;i++){
        for(int j=0;j<words[i].length();j++){
            if(words[i].charAt(j) == x){
                ans.add(i);
                break;
            }            
        }                
    }
    return ans;       
    }
}
