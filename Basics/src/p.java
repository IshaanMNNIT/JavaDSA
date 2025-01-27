import java.util.*;
public class p {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,k;
        System.out.println("Enter rows (odd)");
        int rows = in.nextInt();
        k=(rows+1)/2;
        for(i=1;i<=rows;i++)
        {
            if(i<=k) {
                for(j = 1; j <= i; j++)
                    System.out.print("* ");
            }
            else
            {
                for(j = 1; j<=(rows-i+1);j++)
                    System.out.print("* ");
            }
            System.out.println();

        }
    }
}
