package leetcode;

public class Q5206 {

    public static String removeDuplicates(String s, int k) {

        int n = 1;
        StringBuilder sb = new StringBuilder(s);

        int start = 0;
        while ((++start) < sb.length()) {

            if (sb.charAt(start) == sb.charAt(start - 1)) {
                n++;
            } else {
                n = 1;
            }
            if (n == k) {
                sb = sb.delete(start + 1 - k, start + 1);
                start = 0;
                n = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("pbbcggttciiippooaais", 2));
    }
}
