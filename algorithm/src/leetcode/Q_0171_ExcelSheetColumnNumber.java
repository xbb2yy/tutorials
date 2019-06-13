package leetcode;


import leetcode.common.Pass;

@Pass
public class Q_0171_ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        StringBuilder builder = new StringBuilder(s);
        String s1 = builder.reverse().toString();

        int sum = 0;
        for (int i = 0; i < s.length() ; i++) {
            sum += Math.pow(26, i) * ((int)s1.charAt(i) - 64);
        }
        return sum;
    }
}
