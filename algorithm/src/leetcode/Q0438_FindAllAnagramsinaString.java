package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0438_FindAllAnagramsinaString {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) {
            return ans;
        }
        int l = 0, r = p.length() - 1;
        int[] a = new int[256];
        int[] b= new int[256];
        for(int i = 0; i < p.length(); i++) {
            b[p.charAt(i)] = b[p.charAt(i)] + 1;
        }
        for(int i = 0; i < p.length(); i++) {
            a[s.charAt(i)] = a[s.charAt(i)] + 1;
        }
        while(r < s.length()) {
            boolean is = true;
            for(int i = 0; i < b.length; i++) {
                if (a[i] != b[i]) is = false;
            }
            if (is) {
                ans.add(l);
            }
            if (r + 1 < s.length()) {
                a[s.charAt(l)] = a[s.charAt(l++)] - 1;
                a[s.charAt(r + 1)] = a[s.charAt(++r)] + 1;
            } else{ break;}
        }
        return ans;
    }

    public static void main(String[] args) {
        findAnagrams("cbaebabacd", "abc");
    }
}
