package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

@Pass
public class Q1046_LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        if (stones.length == 1) {
            return stones[0];
        }

        if (stones.length == 0) {
            return 0;
        }

        Arrays.sort(stones);
        if (stones[stones.length - 1] == stones[stones.length - 2]) {
            int[] a = new int[stones.length - 2];
            for (int i = 0; i < stones.length - 2; i++) {
                a[i] = stones[i];
            }
            return lastStoneWeight(a);
        } else {
            int[] a = new int[stones.length - 1];
            for (int i = 0; i < stones.length - 2; i++) {
                a[i] = stones[i];
            }
            a[stones.length - 2] = (stones[stones.length - 1] - stones[stones.length - 2]);
            return lastStoneWeight(a);
        }

    }

    public static void main(String[] args) {
        int[] a = {2,7,4,1,8,1};
        lastStoneWeight(a);
    }


}
