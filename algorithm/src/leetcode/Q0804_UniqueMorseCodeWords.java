package leetcode;

import leetcode.common.Pass;

import java.util.HashSet;
import java.util.Set;

@Pass
public class Q0804_UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
       String[] strs = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
               ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> s = new HashSet<>();
        for (int i = 0; i < words.length ; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
               builder.append(strs[words[i].charAt(j) - 'a']);
            }
            s.add(builder.toString());
        }
        return s.size();
    }
}
