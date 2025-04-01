import java.util.*;
public class mazeWithObstructions {
    public static void main(String[] args) {
        boolean [][] board = {
                {true , true , true},
                {true , false , true},
                {true , true ,true}
        };
        pathRestrictions("",board,0,0);
    }
    static void pathRestrictions(String p , boolean[][]board, int row , int col)
    {
        if(row == board.length - 1 && col == board[0].length - 1)
        {
            System.out.println(p);
            return;
        }
        if(board[row][col] == false)
        {
            return;
        }
        if(row < board.length - 1)
        {
            pathRestrictions(p + 'D',board,row + 1 , col);
        }
        if(col < board[0].length - 1)
        {
            pathRestrictions(p + 'R',board,row,col + 1);
        }
    }
}
