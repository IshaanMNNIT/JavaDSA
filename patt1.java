import java.util.*;
class patt1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = in.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
