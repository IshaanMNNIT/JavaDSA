import java.util.Scanner;
public class patt8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = in.nextInt();
        int i,j,k,a=2*(n-1);
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=a;k++)
            {
                System.out.print(" ");
            }
            a-=2;
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}