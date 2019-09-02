package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Pass
public class Q0030_SubstringwithConcatenationofAllWords {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<String> list = new ArrayList<>(Arrays.asList(words));
        List<Integer> ans = new ArrayList<>();
        if (words.length == 0) {
            return ans;
        }
        int sum = 0;
        for (String word : words) {
            sum += word.length();
        }
        for (int i = 0; i < s.length() - sum; i++) {
            int solution = solution(i, s.substring(i), list);
            if (solution != -1) {
                ans.add(solution);
            }
        }
        return ans;

    }

    public static int solution(int start, String s, List<String> list) {
        if (list.size() == 0) {
            return start;
        }
        for (int i = 0; i < list.size(); i++) {
            if (s.startsWith(list.get(i))) {
                List<String> l = new ArrayList<>(list);
                l.remove(i);
               return solution(start, s.substring(list.get(i).length()), l);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    }
}
