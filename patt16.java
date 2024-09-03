import java.util.Scanner;
class patt16
{
    int fact(int a)
    {
        int f=1;
        if(a==0)return 1;
        for(int i = 1; i <= a ; i++)
        {
            f=f*i;
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows to print");
        int n = in.nextInt();
        int i , j , k , a=n-1;
        patt16 ob = new patt16();
        for(i=1;i<=a;i++)
        {
            System.out.print(" ");
        }
        System.out.print("1");
        a--;
        System.out.println();
        for(i=1;i<n;i++)
        {
            for(k=1;k<=a;k++)
                System.out.print(" ");
            a--;
            for(j=0;j<=i;j++)
            {
                System.out.print(((ob.fact(i))/(ob.fact(j)* ob.fact(i-j))+" "));
            }
            System.out.println();
        }
    }
}