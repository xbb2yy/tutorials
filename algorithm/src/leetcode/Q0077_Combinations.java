package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q0077_Combinations {

    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> integers = new ArrayList<>(); ;
        help(n, k,integers);
        return ans;
    }

    private void help(int n, int k, List<Integer> list) {
        if (k == 0) {
            ans.add(list);
            return;
        }
        for (int i = n; i >= n - k; i--) {
            List<Integer> l = new ArrayList<>();
            help(n - 1, k - 1, l);
        }

    }

}
