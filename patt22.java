public class patt22 {
    public static void main(String[] args) {


        int i, j;
        int n = 5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                    if(j%2!=0)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");
                }
                else
                {
                    if(j%2==0)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");
                }

            }
            System.out.println();
        }

    }
}