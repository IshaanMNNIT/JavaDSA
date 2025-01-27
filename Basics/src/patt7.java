import java.util.*;
class patt7
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = in.nextInt();
        int i,j,k,a=0;
        for(i=n;i>=1;i--)
        {
            for(k=1;k<=a;k++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            a+=2;
            System.out.println();
        }
    }
}
