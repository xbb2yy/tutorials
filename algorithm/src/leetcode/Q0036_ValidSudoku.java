package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0036_ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        List<Character>[] rows = new ArrayList[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new ArrayList<>();
        }
        List<Character>[] cols = new ArrayList[9];
        for (int i = 0; i < 9; i++) {
            cols[i] = new ArrayList<>();
        }
        List<Character>[] mixs = new ArrayList[9];
        for (int i = 0; i < 9; i++) {
            mixs[i] = new ArrayList<>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                List<Character> row = rows[i];
                if (row.contains(board[i][j])) {
                    return false;
                } else {
                    row.add(board[i][j]);
                }

                List<Character> col = cols[j];
                if (col.contains(board[i][j])) {
                    return false;
                } else {
                    col.add(board[i][j]);
                }

                int m = (i) / 3 * 3  + j / 3;
                List<Character> mix = mixs[m];
                if (mix.contains(board[i][j])) {
                    return false;
                } else {
                    mix.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
