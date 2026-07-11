class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        
        List<List<String>> ans = nQueen(board, 0);

        return ans;
    }
    
    static List<List<String>> nQueen(boolean[][] board, int r) {
        List<List<String>> ans = new ArrayList<>();
        if (r == board.length) {
            List<String> z = printQ(board);
            ans.add(new ArrayList<>(z));
            return ans;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, r, col)) {
                board[r][col] = true;
                ans.addAll(nQueen(board, r+1));
                board[r][col] = false;
            }
        }

        return ans;
    }

    static List<String> printQ(boolean[][] board) {
        List<String> sAns = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder k = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    k.append("Q");
                }   else {
                    k.append(".");
                }
            }
            String m = k.toString();
            sAns.add(m);
        }
        return sAns;
    }

    static boolean isSafe(boolean[][] board, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (board[i][c]) {
                return false;
            }
        }

        int min = Math.min(r, c);

        int col = c-1;
        for (int i = 1; i <= min && r-i > -1 && col > -1; i++) {
            if (board[r-i][col]) {
                return false;
            }
            col--;
        }

        int l = board.length;
        col = c+1;
        for (int i = 1; i <= l-(min+1) && r-i > -1 && col < board.length; i++) {
            if (board[r-i][col]) {
                return false;
            }
            col++;
        }

        return true;
    }

}