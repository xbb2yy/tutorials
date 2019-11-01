package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q0384_ShuffleanArray {

    private int[] original;
    private int[] copy;
    public Q0384_ShuffleanArray(int[] nums) {
        copy = nums;
        System.arraycopy(nums, 0, original, 0, nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
       List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < original.length; i++) {
            list.add(original[i]);
        }
        Collections.shuffle(list);
        for (int i = 0; i < original.length; i++) {
            copy[i] = list.get(i);
        }
        return copy;
    }
}
