package leetcode;


import leetcode.common.Pass;

@Pass
public class Q0007_ReverseInteger {

    public static int reverse(int x) {

        boolean b = x < 0;
        String s;

        StringBuilder reverse = new StringBuilder(String.valueOf(x)).reverse();
        if (b) {
            s = reverse.substring(0, reverse.length() - 1);
        } else {
            s = reverse.toString();
        }

        try {
            int i;
            if (b) {
                i = Integer.parseInt('-' + s);
            } else {
                i = Integer.parseInt(s);
            }
            return i;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int solution(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
