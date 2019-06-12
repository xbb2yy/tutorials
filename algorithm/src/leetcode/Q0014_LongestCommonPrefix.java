package leetcode;

@Pass
public class Q0014_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        // 考虑极限情况，增加数组不为空的判断。
        if (strs.length == 0) {
            return "";
        }

        String str = strs[0];

        StringBuilder f = new StringBuilder();
        for (int i = 0; i < str.length() ; i++) {
            f.append(str.charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(f.toString())) {
                    return f.deleteCharAt(f.length() - 1 ).toString();
                }
            }
        }

        return f.toString();
    }
}
