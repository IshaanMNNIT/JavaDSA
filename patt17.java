import java.util.*;
class patt17
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the odd number of rows");
        int n =in.nextInt();
        int i , j , k , a = (n+1)/2;

        int c = n-1;
        int d,e ;
        for(i=1;i<=a;i++)
        {
            d=i;
            e=2;
            for(k=1;k<=c;k++)
                System.out.print(" ");
            c-=2;
            for(j=1;j<=(2*i-1);j++) {
                if(j<=i)
                    System.out.print((d--)+" ");
                else
                    System.out.print((e++)+" ");

            }
            System.out.println();
        }
        c=2;
        for(i=a-1;i>=1;i--)
        {
            d=i;
            e=2;
            for(k=1;k<=c;k++)
                System.out.print(" ");
            c+=2;
            for(j=1;j<=(2*i-1);j++) {
                if(j<=i)
                    System.out.print((d--)+" ");
                else
                    System.out.print((e++)+" ");

            }
            System.out.println();
        }


    }
}