// Gemini solution to see the time and space


class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        // Find the first empty cell denoted by '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if (!emptyLeft) {
                break;
            }
        }

        // If no empty cell is left, Sudoku is solved
        if (emptyLeft) {
            return true;
        }

        // Backtrack using characters '1' through '9'
        for (char val = '1'; val <= '9'; val++) {
            if (isSafe(board, row, col, val)) {
                board[row][col] = val;
                
                if (solve(board)) {
                    return true;
                } else {
                    // Undo the choice (backtrack)
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    private boolean isSafe(char[][] board, int row, int col, char val) {
        // Check row and column in a single loop
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == val) return false;
            if (board[i][col] == val) return false;
        }

        // Check the 3x3 sub-grid
        int rowStart = row - row % 3;
        int colStart = col - col % 3;

        for (int r = rowStart; r < rowStart + 3; r++) {
            for (int c = colStart; c < colStart + 3; c++) {
                if (board[r][c] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}
