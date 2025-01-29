import java.util.*;
public class CheckForPowerOf2Method2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n & (n-1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not a Power of 2");

    }
}
