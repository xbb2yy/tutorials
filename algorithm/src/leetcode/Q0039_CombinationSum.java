package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Pass
public class Q0039_CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        find(candidates, target, list, l, 0);
        return list;

    }

    public static void find(int[] a, int t, List<List<Integer>> list, List<Integer> l, int n) {
        if (t < a[n]) {
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
            find(a, t - a[j], list, k, j);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7};
        List<List<Integer>> lists = combinationSum(a, 7);
        System.out.println(lists);
    }
}
