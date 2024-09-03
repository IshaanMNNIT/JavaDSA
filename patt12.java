import java.util.Scanner;
public class patt12  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = in.nextInt();
        int i,j,k,a=0;
        for(i=n;i>=1;i--)
        {
            for(k=1;k<=a;k++)
            {
                System.out.print(" ");
            }
            a++;
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        a=n-1;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=a;k++)
            {
                System.out.print(" ");
            }
            a--;
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
