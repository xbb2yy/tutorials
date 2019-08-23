package leetcode;

public class Q0999_AvailableCapturesforRook {

    public int numRookCaptures(char[][] board) {


        int m = 0, n = 0;
        it:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ('R' == board[i][j]) {
                    m = i;
                    n = j;
                    break it;
                }
            }
        }


        System.out.println(m + ":" + n);
        return 0;
    }
}
