package leetcode;

public class Q0415_AddStrings {

    public static String addStrings(String num1, String num2) {

        int a = num1.length();
        int b = num2.length();
        StringBuilder sb = new StringBuilder();
        int k = (a < b) ? a : b;
        int carry = 0;
        for (int i = 1; i <= k ; i++) {
            sb.insert(0, (num1.charAt(a - i) + num2.charAt(b - i) + carry - 96) % 10);
            carry = (num1.charAt(a - i) + num2.charAt(b - i)  + carry - 96) / 10;
        }

        if (a > k) {
            for (int i = a - k - 1; i >= 0 ; i--) {
                sb.insert(0, (num1.charAt(i)  + carry - 48) % 10);
                carry = (num1.charAt(i)  + carry - 48) / 10;
            }
        }

        if (b > k) {
            for (int i = b - k - 1; i >= 0 ; i--) {
                sb.insert(0, (num2.charAt(i)  + carry - 48) % 10);
                carry = (num2.charAt(i)  + carry - 48) / 10;
            }
        }

        if (carry != 0) {
            sb.insert(0, 1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("408", "5"));
    }
}
