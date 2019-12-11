package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q0077_Combinations {

    private List<List<Integer>> ans = new ArrayList<>();
    private int limit;

    public List<List<Integer>> combine(int n, int k) {
        limit = k;
        List<Integer> integers = new ArrayList<>();
        help(n, k, integers);
        return ans;
    }

    private void help(int n, int k, List<Integer> list) {
        if (list.size() == limit) {
            ans.add(list);
            return;
        }
        if (n == 0) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i < limit - list.size()) continue;
            List<Integer> t = new ArrayList<>(list);
            t.add(i);
            help(i - 1, k - 1, t);
        }
    }

    public static void main(String[] args) {
        Q0077_Combinations q = new Q0077_Combinations();
        q.combine(4, 2);
    }

}
