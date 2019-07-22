package leetcode;


public class Q0168_ExcelSheetColumnTitle {

    public static String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();

        int tmp = n;
        while ((tmp > 26)) {
            int k = n % 26;
            tmp = tmp / 26;
            if (k == 0 && tmp <= 26) {
                k = 26;
                tmp--;
            }
            if (k == 0) {
                k = 26;
            }
            builder.insert(0, (char) (k + 64));
        }
        if (tmp != 0) {

            builder.insert(0, (char) (tmp + 64));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(520));
    }
}
