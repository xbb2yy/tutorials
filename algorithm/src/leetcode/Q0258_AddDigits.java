package leetcode;

public class Q0258_AddDigits {

    public static int addDigits(int num) {

        String s = String.valueOf(num);
        while (Integer.parseInt(s) >= 10) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Integer.parseInt("" + s.charAt(i));
            }
            s = String.valueOf(sum);
        }
        return Integer.parseInt(s);
    }

    public static int solution(int num) {
        return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        addDigits(38);
    }
}
