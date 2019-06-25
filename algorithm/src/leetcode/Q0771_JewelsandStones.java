package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0771_JewelsandStones {

    public int numJewelsInStones(String J, String S) {

        int sum = 0;
       /* for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    sum++;
                }
            }
        }*/
        for (int i = 0; i < S.length() ; i++) {
            if (J.contains(new String(new char[]{S.charAt(i)}))) sum++;
        }

        return sum;
    }
}
