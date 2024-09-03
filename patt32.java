public class patt32 {
    public static void main(String[] args) {
        int n = 5 ;
        int a = n + 64 ;
        int b;
        int i , j;
        for(i=1;i<=n;i++)
        {
            b=a;
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(b++));
            }
            a--;
            System.out.println();
        }
    }
}
