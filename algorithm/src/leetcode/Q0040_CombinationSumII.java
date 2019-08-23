package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0040_CombinationSumII {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        find(candidates, target, list, l, 0);
        return list;
    }

    // TODO  重复元素
    public static void find(int[] a, int t, List<List<Integer>> list, List<Integer> l, int n) {
        if (n >= a.length || t < a[n]) {
            return;
        }

        int i = Arrays.binarySearch(a, n, a.length, t);
        if (i >= 0) {
            List<Integer> m = new ArrayList<>();
            m.addAll(l);
            m.add(a[i]);
            list.add(m);
        }
        for (int j = n; j < a.length; j++) {
            if (j == i) {
                continue;
            }
            List<Integer> k = new ArrayList<>();
            k.addAll(l);
            k.add(a[j]);
            find(a, t - a[j], list, k, j + 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {10,1,2,7,6,1,5};
        List<List<Integer>> lists = combinationSum2(a, 8);
        System.out.println(lists);
    }
}
