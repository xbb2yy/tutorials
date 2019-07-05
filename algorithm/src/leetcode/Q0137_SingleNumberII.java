package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.Map;

@Pass
public class Q0137_SingleNumberII {

    Map<Integer, Integer> map = new HashMap<>();

    public int singleNumber(int[] nums) {

        for (int num : nums) {
            map.compute(num, (k, v) -> {
                Integer integer = map.get(k);
                if (integer == null) {
                    return 1;
                }
                return integer + 1;
            });
        }

        return map.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
    }

    public static void main(String[] args) {
        System.out.println(1 | 1 | 1);
    }
}
