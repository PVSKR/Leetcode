class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] subGrid = new boolean[9][9];
        
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int c = board[i][j] - '1';
                int subi = i/3, subj = j/3;
                int posInSubGrid = subi*3 + subj;
                if(row[i][c] || col[c][j] || subGrid[posInSubGrid][c]) return false;
                row[i][c] = true;
                col[c][j] = true;
                subGrid[posInSubGrid][c] = true;
            }
        }
        return true;

        // Set<String> set = new HashSet<>();
        // for(int i=0; i<9; i++) {
        //     for(int j=0; j<9; j++) {
        //         char c = board[i][j];
        //         if(board[i][j] != '.') {
        //             if(!set.add(c + "in row" + i) ||
        //              !set.add(c + "in col" + j) ||
        //              !set.add(c + "in block" + i/3 + "," + j/3)) return false;
        //         }
        //     }
        // }
        // return true; 
    }
}