import java.util.*;
public class PatternImp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value for n");
        int n = in.nextInt();

        int i,j,k;

        char ch;
        for(i=1;i<=n;i++)
        {
            ch = 'A';
            for(k=1;k<=2*(i-1);k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*(n-i)+1;j++)
            {
                if(i==1)
                {
                    System.out.print(ch+" ");ch++;
                }
                else
                {
                    if(j==1 || j==(2*(n-i)+1))
                    {
                        System.out.print(ch+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                    ch++;
                }

            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++)
        {
            ch = 'A';
            for(k=1;k<=2*(n-i-1);k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=(2*i+1);j++)
            {
                if(i==(n-1))
                {
                    System.out.print(ch+" ");ch++;
                }
                else
                {
                    if(j==1 || j==(2*i+1))
                    {
                        System.out.print(ch+" ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                    ch++;
                }
            }
            System.out.println();
        }
    }
}
