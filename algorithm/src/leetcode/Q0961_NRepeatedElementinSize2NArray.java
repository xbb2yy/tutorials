package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Q0961_NRepeatedElementinSize2NArray {

    public int repeatedNTimes(int[] A) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            }
            set.add(A[i]);
        }

        return -1;
    }
}
