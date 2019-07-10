package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0824_GoatLatin {

    public String toGoatLatin(String S) {
        if (S == null) {
            return null;
        }
        String[] s = S.split(" ");
        String[] strings = new String[s.length];
        StringBuilder a = new StringBuilder("a");

        for (int i = 0; i < s.length; i++) {
            if (s[i].charAt(0) == 'a' || s[i].charAt(0) == 'e' || s[i].charAt(0) == 'i' || s[i].charAt(0) == 'o'
                    || s[i].charAt(0) == 'u' || s[i].charAt(0) == 'A' || s[i].charAt(0) == 'E' || s[i].charAt(0) == 'I'
                    || s[i].charAt(0) == 'O'
                    || s[i].charAt(0) == 'U') {
                String ma = s[i].concat("ma").concat(a.toString());
                strings[i] = ma;
                a.append("a");
            } else {
                StringBuilder ma = new StringBuilder(s[i]).deleteCharAt(0).append(s[i].charAt(0)).append("ma").append(a);
                strings[i] = ma.toString();
                a.append("a");
            }
        }

        return String.join(" ", strings);
    }
}
