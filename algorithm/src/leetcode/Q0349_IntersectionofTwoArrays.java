package leetcode;

import leetcode.common.Pass;

import java.util.HashSet;
import java.util.Set;

@Pass
public class Q0349_IntersectionofTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        Set<Integer> l = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                l.add(nums2[i]);
        }
        int[] a = new int[l.size()];
        int i = 0;
        for (Integer integer : l) {
            a[i] = integer;
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        intersection(a, b);
    }
}
