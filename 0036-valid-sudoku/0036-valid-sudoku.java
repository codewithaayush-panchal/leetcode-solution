class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    boolean isSafeOrNot = isSafe(board, i, j);
                    if (!isSafeOrNot) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    static boolean isSafe(char[][] board, int i, int j) {
        char c = board[i][j];
        for (int a = j+1; a < board[i].length; a++) {
            if (board[i][a] == c) {
                return false;
            }   
        }
        for (int a = i+1; a < board.length; a++) {
            if (board[a][j] == c) {
                return false;
            }
        }
        int row = i - (i % 3);
        int col = j - (j % 3);

        for (int a = row; a < row+3; a++) {
            for (int b = col; b < col+3; b++) {
                if (a != i && b != j && board[a][b] == c){
                    return false;
                }
            }
        }
        return true;
    }

}