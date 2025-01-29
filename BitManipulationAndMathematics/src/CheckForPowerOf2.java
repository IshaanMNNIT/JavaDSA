import java.util.*;
public class CheckForPowerOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0 ;
        while(n>0)
        {
            if((n & 1) == 1)
            {
                count++;
            }
            n = n >> 1;
        }
        if(count == 1)
            System.out.println("Power of 2");
        else
            System.out.println("Not a Power of 2");
    }
}
