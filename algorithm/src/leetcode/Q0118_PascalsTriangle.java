package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0118_PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        if (numRows == 1) {
            list.add(Arrays.asList(1));
            return list;
        }
        if (numRows == 2) {
            list.add(Arrays.asList(1));
            list.add(Arrays.asList(1, 1));
            return list;
        }

        list.add(Arrays.asList(1));
        list.add(Arrays.asList(1, 1));
        for (int i = 2; i < numRows; i++) {
            List<Integer> t = new ArrayList<>();
            t.add(1);

            List<Integer> prev = list.get(i - 1);
            for (int j = 1; j < i ; j++) {
                t.add(prev.get(i) + prev.get(i - 1));
            }
            t.add(1);
        }

        return list;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
