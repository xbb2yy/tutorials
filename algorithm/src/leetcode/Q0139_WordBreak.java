package leetcode;

import java.util.Arrays;
import java.util.List;

public class Q0139_WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s.equals("")) return true;

        for (int i = 0; i < wordDict.size(); i++) {
            if (s.length() >= wordDict.get(i).length() && s.substring(0, wordDict.get(i).length()).equals(wordDict.get(i))) {
                if (wordBreak(s.substring(wordDict.get(i).length()), wordDict)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak("catsandog", strings));
    }
}
