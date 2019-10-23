package leetcode;

public class Q0520_DetectCapital {

    public static boolean detectCapitalUse(String word) {

        boolean startWithCaptital = (word.charAt(0) - 'Z' <= 0);
        Boolean flag = null;
        for (int i = 1; i < word.length(); i++) {
            if (startWithCaptital) {
                if (flag == null) {
                    flag = word.charAt(i) - 'Z' <= 0;
                } else {
                    if (flag ^ (word.charAt(i) - 'Z' <= 0)) {
                        return false;
                    }
                }

            } else {
                if (word.charAt(i) - 'Z' <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(true ^ false);

        System.out.println((int)'a');
        System.out.println((int)'A');
        System.out.println((int)'F');
        detectCapitalUse("FlaG");
    }
}
