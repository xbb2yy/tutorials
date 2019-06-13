package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;
import java.util.LinkedList;

@Pass
public class Q0189_RotateArray {

    public static void rotate(int[] nums, int k) {

        LinkedList<Integer> objects = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            objects.add(nums[i]);
        }

        for (int i = 0; i < k; i++) {
            Integer integer = objects.removeLast();
            objects.addFirst(integer);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = objects.removeFirst();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
