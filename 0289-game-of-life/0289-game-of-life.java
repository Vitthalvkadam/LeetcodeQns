class Solution {
    public void gameOfLife(int[][] board) {
         int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int count = 0;

                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {

                        if (x >= 0 && x < m && y >= 0 && y < n
                                && !(x == i && y == j)
                                && Math.abs(board[x][y]) == 1)
                            count++;
                    }
                }

                 if (board[i][j] == 1 && (count < 2 || count > 3))
                    board[i][j] = -1;

                if (board[i][j] == 0 && count == 3)
                    board[i][j] = 2;
            }
        }

        for(int[] row : board){
            for (int j = 0; j < n; j++) {
                if (row[j] == -1) row[j] = 0;
                else if (row[j] == 2) row[j] = 1;
            }
        }
    }
}