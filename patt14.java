import java.util.Scanner;
public class patt14{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows to print");
        int n = in.nextInt();
        int i,j,k,a=2*n-1,b=1;
        for(i=1;i<=a;i++)
            System.out.print("*");
        System.out.println();
        for(i=n-1;i>=1;i--)
        {
            for(k=1;k<=b;k++)
            {
                System.out.print(" ");
            }
            b++;
            for(j=1;j<=(2*i-1);j++)
            {
                if(j==1 || j==(2*i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }

    }
}

