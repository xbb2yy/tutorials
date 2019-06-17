package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0728_SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String s = String.valueOf(i);

            boolean is = true;
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) - 48 == 0) {
                    is = false;
                    break;
                }
                if (i % (s.charAt(j) - 48) == 0) {
                    continue;
                } else {
                    is = false;
                    break;
                }
            }

            if (is) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        selfDividingNumbers(1, 22);
    }
}
