package leetcode;

import leetcode.common.Pass;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0989_AddtoArrayFormofInteger {

    public List<Integer> addToArrayForm(int[] A, int K) {

        StringBuilder b = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            b.append(A[i]);
        }

        BigDecimal bigDecimal = new BigDecimal(b.toString());

        BigDecimal add = bigDecimal.add(new BigDecimal(K));

        String s = add.toString();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(Integer.parseInt(s.charAt(i) + ""));
        }

        return list;
    }
}
