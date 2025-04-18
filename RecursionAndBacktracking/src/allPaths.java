import java.util.*;
public class allPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        pathAll("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }
    // Wrong Function
//    static void pathAll(String p,boolean board[][] , int row , int col)
//    {
//        if(row == board.length - 1 && col == board[0].length - 1)
//        {
//            System.out.println(p);
//            return;
//        }
//        if(board[row][col] == false)
//        {
//            return;
//        }
//        if(row < board.length - 1)
//        {
//            pathAll(p + 'D',board,row + 1 , col);
//        }
//        if(col < board[0].length - 1)
//        {
//            pathAll(p + 'R',board,row,col + 1);
//        }
//        if(row > 0)
//        {
//            pathAll(p + 'U',board,row - 1 ,col);
//        }
//        if(col > 0)
//        {
//            pathAll(p + 'L',board,row,col -1);
//        }
//    }
    static void pathAll(String p,boolean board[][] , int row , int col)
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
        board[row][col] = false;
        if(row < board.length - 1)
        {
            pathAll(p + 'D',board,row + 1 , col);
        }
        if(col < board[0].length - 1)
        {
            pathAll(p + 'R',board,row,col + 1);
        }
        if(row > 0)
        {
            pathAll(p + 'U',board,row - 1 ,col);
        }
        if(col > 0)
        {
            pathAll(p + 'L',board,row,col -1);
        }
        board[row][col] = true;
    }
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r+1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if (r > 0) {
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if (c > 0) {
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}