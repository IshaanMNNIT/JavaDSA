import java.util.*;
public class Finding_a_the_power_of_p {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = 1 , i = 0;
        while(b>0)
        {
            if((b&1) == 1)
            {
                ans *= (int)(Math.pow(3,i));
            }
            i += 2;
            b = b>>1;
        }
        System.out.println("Result : " + ans);
    }
}

