package leetcode;

public class Q0012_IntegertoRoman {

    public static String intToRoman(int num) {

        StringBuilder s = new StringBuilder();
        int t = num;
        while (t > 0) {
            if (t >= 1000) {
                int i = num / 1000;
                for (int j = 0; j < i; j++) {
                    s.append('M');
                }
                t = t - 1000 * i;
            }
            if (t >= 900) {
                s.append("CM");
                t -= 900;
            }
            if (t >= 500) {
                int i = (t - 500) / 100;
                s.append("D");
                for (int j = 0; j < i; j++) {
                    s.append('C');
                }
                t = t - 500 - i * 100;
            }
            if (t >= 400) {
                s.append("CD");
                t -= 400;
            }

            if (t >= 100) {
                int i = t / 100;
                for (int j = 0; j < i; j++) {
                    s.append('C');
                }
                t -= 100 * i;
            }
            if (t >= 90) {
                s.append("XC");
                t -= 90;
            }

            if (t >= 50) {
                int i = (t - 50) / 10;
                s.append("L");
                for (int j = 0; j < i; j++) {
                    s.append('X');
                }
                t = t - 50 - i * 10;
            }
            if (t >= 40) {
                s.append("XL");
                t -= 40;
            }
            if (t >= 10) {
                int i = t / 10;
                for (int j = 0; j < i; j++) {
                    s.append('X');
                }
                t -= 10 * i;
            }
            if (t >= 9) {
                s.append("IX");
                t -= 9;
            }
            if (t >= 5) {
                int i = (t - 5);
                s.append('V');
                for (int j = 0; j < i; j++) {
                    s.append('I');
                }
                t = t - 5 - i;
            }
            if (t == 4) {
                s.append("IV");
                t -= 4;
            }
            if (t < 4) {
                for (int i = 0; i < t; i++) {
                    s.append('I');
                }
                t = 0;
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {
        intToRoman(58);
    }
}
