package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Q0345_ReverseVowelsofaString {

    public static String reverseVowels(String s) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            if (vowels.contains(chars[i])) {
                if (vowels.contains(chars[j])) {
                    char a = s.charAt(i);
                    chars[i] = s.charAt(j);
                    chars[j] = a;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        reverseVowels("hello");
    }
}
