public class patt18 {
    public static void main(String[] args) {
        int n = 5 ;
        int i,j,k,a=0;
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(k=1;k<=a;k++)
            {
                System.out.print(" ");
            }
            a+=2;
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        a=2*(n-1);
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(k=1;k<=a;k++)
            {
                System.out.print(" ");
            }
            a-=2;
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
