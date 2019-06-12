package leetcode;


@Pass
public class Q007_ReverseInteger {

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

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
