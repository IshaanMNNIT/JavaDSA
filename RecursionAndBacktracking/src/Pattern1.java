public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        printPattern(1,1,n);
        printPattern2(1,1,n);
    }
    static void printPattern(int row, int col, int n)
    {
        if(row == n + 1)return;
        if(col <= n - row + 1)
        {
            System.out.print("* ");
            printPattern(row , col + 1 , n);
        }
        else
        {
            System.out.println();
            printPattern(row+1,1,n);
        }
    }
    static void printPattern2(int row,int col,int n)
    {
        if(row == n + 1)return;
        if(col <= row)
        {
            System.out.print("* ");
            printPattern2(row , col + 1 , n);
        }
        else
        {
            System.out.println();
            printPattern2(row+1,1,n);
        }
    }
}
