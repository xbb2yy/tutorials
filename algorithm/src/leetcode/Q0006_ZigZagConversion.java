package leetcode;

public class Q0006_ZigZagConversion {

    public static String convert(String s, int numRows) {

        /**
         * 第一次提交没加这个判断导致死循环，java heap溢出
         */
        if (numRows == 1) {
            return s;
        }
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            boolean flag = true;
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); ) {
                sb.append(s.charAt(j));
                if (i == 0 || i == numRows - 1) {
                    j += (numRows - 1) * 2;
                } else {
                    if (flag) {
                        j += (numRows * 2 - 2) - i * 2;
                        flag = false;
                    } else {
                        j += 2 * i;
                        flag = true;
                    }
                }

            }
            r.append(sb);
        }
        return r.toString();
    }

    public static void main(String[] args) {
        convert("A",1);
    }
}
