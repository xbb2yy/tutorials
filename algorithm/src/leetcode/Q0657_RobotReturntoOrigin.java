package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0657_RobotReturntoOrigin {
    public boolean judgeCircle(String moves) {
        int[] a = {0, 0};
        for(int i = 0; i < moves.length(); i ++) {
            if (moves.charAt(i) == 'R') {
                a[0]++;
            }
            if (moves.charAt(i) == 'L') {
                a[0]--;
            }
            if (moves.charAt(i) == 'U') {
                a[1]++;
            }
            if (moves.charAt(i) == 'D') {
                a[1]--;
            }
        }
        return a[0] == 0 && a[1] == 0;
    }
}
