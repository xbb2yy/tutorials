package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0448_FindAllNumbersDisappearedinanArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        boolean[] b = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length ; i++) {
            b[nums[i]] = true;
        }

        for (int i = 1; i < b.length; i++) {
            if (!b[i]) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        boolean[] b = new boolean[1];
        System.out.println(b[0]);
    }
}
