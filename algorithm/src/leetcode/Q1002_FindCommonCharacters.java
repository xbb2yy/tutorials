package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Pass
public class Q1002_FindCommonCharacters {

    public static List<String> commonChars(String[] A) {

        String str = A[0];

        for (String s : A) {
            if (s.length() < str.length()) {
                str = s;
            }
        }

        List<String> list = new ArrayList<>();
        HashSet<Character> set = new HashSet();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        for (Character c : set) {
            int a = 100;
            for (String s : A) {
                int c2 = 0;
                for (char c1 : s.toCharArray()) {
                    if (c1 == c) {
                        c2++;
                    }
                }
                if (c2 < a) {
                    a = c2;
                }
            }
            for (int i = 0; i < a; i++) {
                list.add(c + "");
            }
        }

        return list;
    }

    public static void main(String[] args) {
        String[] sts = {"bella", "label", "roller"};
        commonChars(sts);
    }
}
