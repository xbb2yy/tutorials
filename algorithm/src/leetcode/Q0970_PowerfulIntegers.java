package leetcode;

import java.util.*;

public class Q0970_PowerfulIntegers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i <= 1000; i++) {
            if (Math.pow(x, i) >= bound) {
                break;
            }
            for (int j = 0; j <= 1000 ; j++) {
                int i1 = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (i1 <= bound) {
                    list.add(i1);
                } else {
                    break;
                }
            }
        }

        return new ArrayList<>(list);
    }

    public static void main(String[] args) {
      //  System.out.println((Integer)Math.pow(4, 3));

    }
}
