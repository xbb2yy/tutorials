package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q937_ReorderLogFiles {

    public static String[] reorderLogFiles(String[] logs) {

        String[] r = new String[logs.length];
        List<String> list = new ArrayList<>();
        List<String> ch = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            String[] s = logs[i].split(" ");
            if (Character.isDigit(s[1].charAt(0))) {
                list.add(logs[i]);
                continue;
            }
            ch.add(logs[i].replaceFirst(s[0] + " ", "").concat(" " + s[0]));
        }
        ch.sort(String::compareTo);

        for (int i = 0; i < ch.size() ; i++) {
            String[] s = ch.get(i).split(" ");
            String s1 = s[s.length - 1];
            s[s.length - 1] = "";

            r[i] = (s1 + " ").concat(String.join(" ", s));
        }

        int k = 0;
        for (int i = ch.size(); i < logs.length; i++) {
           r[i] = list.get(k);
           k++;
        }
        return r;
    }

    public static void main(String[] args) {
      String[] strs =  {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
      reorderLogFiles(strs);
    }
}
