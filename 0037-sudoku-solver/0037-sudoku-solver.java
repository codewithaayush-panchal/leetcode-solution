class Solution {
    public void solveSudoku(char[][] board) {
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    arr[i][j] = 0;
                }   else {
                    arr[i][j] = board[i][j] - '0';
                }
            }
        }

        solve(arr);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = (char)(arr[i][j] + '0');
            }
        }
    }

    static boolean solve(int[][] board) {
            int n = board.length;
            int row = -1;
            int col = -1;

            boolean emptyLeft = true;

            // this is how we are replacing the r,c from arguments
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 0) {
                        row = i;
                        col = j;
                        emptyLeft = false;
                        break;
                    }
                }
                // if you found some empty element in row, then break
                if (emptyLeft == false) {
                    break;
                }
            }

            if (emptyLeft == true) {
                return true;
                // soduko is solved
            }

            // backtrack
            for (int number = 1; number <= 9; number++) {
                if (isSafe(board, row, col, number)) {
                    board[row][col] = number;
                    if (solve(board)) {
                        // found the answer
                        return true;
                    } else {
                        // backtrack
                        board[row][col] = 0;
                    }
                }
            }
            return false;
        }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][i] == num) {
                return false;
            }
        }

        // check the col
        for (int[] nums : board) {
            // check if the number is in the col
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }

}