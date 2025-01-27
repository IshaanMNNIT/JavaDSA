public class patt33 {
    public static void main(String[] args) {
        int n = 5 ;
        char ch = 'a';int count = 1;

        int i , j;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((count % 2)!=0) {
                    System.out.print(ch++ + " ");
                    count++;
                }
                else
                {
                    System.out.print(Character.toUpperCase(ch++)+" ");
                    count++;
                }


            }
            System.out.println();
        }
    }
}
