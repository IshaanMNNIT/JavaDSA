class Sudoku {
    public static void main(String[] args) {
        char board[][] = new char[9][9];
        solve(0,0,board);
    }

    static boolean solve(int r , int c , char[][]board)
    {
        if(c == 9)
        {
            r++;
            c = 0;
        }
        if(r == 9)
        {
            return true;
        }
        if(board[r][c] != '.')
        {
            if(solve(r,c+1,board))return true;
        }
        else
        {
            for(char d = '1' ; d <= '9' ; d++)
            {
                if(isSafe(board,r,c,d))
                {
                    board[r][c] = d;
                    if(solve(r,c,board))return true;
                    //else : backtrack
                    board[r][c] = '.';
                }
            }
            return false;
        }
        return false;
    }
    static boolean isSafe(char board[][] , int r ,int c ,char d)
    {
        // checking for row
        for(int i = 0 ; i < 9 ; i++)
        {
            if(board[r][i] == d)return false;
        }
        for(int i = 0 ; i < 9 ; i++)
        {
            if(board[i][c] == d)return false;
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;
        for(int i = 0 ; i < sqrt ; i++)
        {
            for(int j = 0 ; j < sqrt ; j++)
            {
                if(board[rowStart + i][colStart + j] == d)return false;
            }
        }
        return true;
    }
}