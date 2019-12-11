package leetcode;

public class Q0028_ImplementstrStr {

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        for(int i = 0; i < haystack.length(); i++) {
            for(int k = 0; k < needle.length(); k++) {
                if (i + k < haystack.length() && haystack.charAt(k + i) == needle.charAt(k)) {
                    if (k == needle.length() - 1) return i;
                    continue;
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}
