import java.util.*; // Hold After Arrays
public class patt31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the extreme number");
        int n = in.nextInt();
        int a = 2*n-1;
        int i,j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=a;j++)
            {
                if((i==1) || (i==a) || (j==1) || ( j==a))
                    System.out.print(n+ " ");
            }
            System.out.println();
        }
    }

}
