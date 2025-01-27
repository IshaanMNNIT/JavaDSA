import java.util.Scanner;
public class patt9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = in.nextInt();
        int i,j,k,a=0;
        for(i=n;i>=0;i--)
        {
            for(k=1;k<=a;k++)
            {
                System.out.print(" ");
            }
            a+=2;
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
