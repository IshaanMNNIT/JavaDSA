import java.util.*;
public class POI1 {
    public void reflection(Scanner in) {

        int a = in.nextInt();
        int b = in.nextInt();
        int d = in.nextInt();
        int lcm = (d*a)*(d*b) / gcd(d*a,d*b);
        System.out.println(lcm);

    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        POI1 obj = new POI1();
        int n = in.nextInt();
        for(int i = 0; i<n; i++)
        {
            obj.reflection(in);
        }
    }
}