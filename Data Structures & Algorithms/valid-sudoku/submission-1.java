class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>(); 

        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                char val = board[r][c];

                if(val == '.') continue;

                if(!seen.add(val + " in row " + r) ||
                   !seen.add(val + " in col " + c) || 
                   !seen.add(val + " in box " + r/3 + "-" + c/3)) {
                    return false;
                }
            }
        }
        return true; 
    }
}
