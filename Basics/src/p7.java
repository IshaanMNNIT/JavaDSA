import java.util.*;//Fibonacci Series
class p7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms of fibonacci Series required to print");
        int n = in.nextInt();
        int a=0;
        int b=1;int c;
        System.out.print(a+", "+b+", ");
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+", ");
            a=b;
            b=c;

        }

    }
}