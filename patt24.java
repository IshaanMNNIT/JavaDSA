public class patt24 {
    public static void main(String[] args) {
        int n = 10; // Even
        int i, j, k, a = n - 2 , b = 0;
        for (i = 1; i <= n / 2; i++) {
            if (i == 1) {
                System.out.print("*");
                for (k = 1; k <= a; k++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
                a -= 2;

            } else {
                System.out.print("*");
                for (k = 1; k <= b; k++)
                    System.out.print(" ");
                System.out.print("*");
                for (k = 1; k <= a; k++)
                    System.out.print(" ");
                System.out.print("*");
                for (k = 1; k <= b; k++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
                a -= 2;
                b++;
            }

        }
        a=0;
        b=n/2 - 2 ;
        for(i=1;i<=n/2;i++)
        {
            if(i==n/2)
            {
                System.out.print("*");
                for(k=1;k<=a;k++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
                a+=2;

            }
            else
            {
                System.out.print("*");
                for(k=1;k<=b;k++)
                    System.out.print(" ");
                System.out.print("*");
                for(k=1;k<=a;k++)
                    System.out.print(" ");
                System.out.print("*");
                for(k=1;k<=b;k++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
                a+=2;
                b--;
            }
        }
    }
}
