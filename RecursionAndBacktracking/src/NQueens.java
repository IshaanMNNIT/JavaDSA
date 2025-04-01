import java.util.*;
public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        System.out.println(queens(board,0));
    }
    static int queens(boolean board[][],int row) // Returns Number of Ways
    {
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // Placing the queen and checking if its valid position for the queen
        for(int col = 0 ; col < board.length ; col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                count = count + queens(board, row + 1);
                board[row][col] = false; // Backtracking Step
            }
        }
        return count;
    }
    static boolean isSafe(boolean board[][] , int row , int col)
    {
        // Checking Vertically if a queen is present
            for(int i = 0 ; i < row ; i++)
            {
                if(board[i][col])return false;
            }

            // Checking Diagonally Left
            int maxLeft = Math.min(row,col);
            int maxRight = Math.min(row, board.length - 1 - col);
            for(int i = 1 ; i <= maxLeft ; i++)
            {
                if(board[row - i][col - i])
                {
                    return false;
                }
            }
            for(int i = 1 ; i <= maxRight ; i++)
            {
                if(board[row - i][col + i])
                {
                    return false;
                }
            }
            return true;
    }
    static void display(boolean board[][])
    {
        for(boolean b[] : board)
        {
            for(boolean i : b)
            {
                if(i)
                {
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
