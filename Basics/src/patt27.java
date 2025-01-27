import java.util.Scanner;
class patt27
{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int i , j , a = 1 , b = n * n + 1 , c = 2*n;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=c;j++)
            {
                if(j<=c/2)
                {
                    System.out.print(a++ + " ");
                }
                else
                {
                    System.out.print(b++ + " ");
                }
            }
            System.out.println();
            c-=2;
        }
    }
}