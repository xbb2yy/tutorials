package leetcode;

public class Q0400_NthDigit {

    public static int findNthDigit(int n) {

        /*List<String> list = Stream.iterate(1, k -> k + 1).limit(n).map(a -> a + "").collect(Collectors.toList());
        String join = String.join("", list);
        char c = join.charAt(n);
        return Integer.parseInt(c + "");*/

        if (n <= 9) {
            return n;
        }

        return 0;

    }

    public static void main(String[] args) {
        findNthDigit(3);
    }
}
