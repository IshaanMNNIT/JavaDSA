import java.util.*;
class patt5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter odd number of rows");
        int n = in.nextInt();
        int a =  (n+1)/2;
        int b = n-a;
        int i,j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=b;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
