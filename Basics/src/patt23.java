import java.util.*;
class patt23
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i , j , k , a , b , c;
        a = n-1;
        b = 2*n-3;
        c=1;
        for(i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(k=1;k<=a;k++)
                    System.out.print(" ");
                System.out.print("*");
                for(k=1;k<=b;k++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
                a--;
                b-=2;

            }


            if(i!=1 && i!=n)
            {
                for(k=1;k<=a;k++)
                    System.out.print(" ");
                System.out.print("*");
                for(k=1;k<=c;k++)
                    System.out.print(" ");
                System.out.print("*");
                for(k=1;k<=b;k++)
                    System.out.print(" ");
                System.out.print("*");
                for(k=1;k<=c;k++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
                a--;
                b-=2;
                c+=2;
            }
            if(i==n)
            {
                System.out.print("*");
                for(k=1;k<=c;k++)
                    System.out.print(" ");
                System.out.print("*");
                for(k=1;k<=c;k++)
                    System.out.print(" ");
                System.out.print("*");
            }

        }
    }
}