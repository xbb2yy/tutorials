package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Pass
public class Q0040_CombinationSumII {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        find(candidates, target, list, l, 0);
        return list;
    }

    public static void find(int[] a, int t, List<List<Integer>> list, List<Integer> l, int n) {
        if (t == 0) {
            list.add(new ArrayList<>(l));
        }
        if (t < 0) {
            return;
        }
        for (int i = n; i < a.length; i++) {
            // 可以去重复
            if (i > n && a[i] == a[i - 1]) {
                continue;
            }
            List<Integer> m = new ArrayList<>(l);
            m.add(a[i]);
            find(a, t - a[i], list, m, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> lists = combinationSum2(a, 8);
        System.out.println(lists);
    }
}
