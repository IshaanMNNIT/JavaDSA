import java.util.*;
public class IntegralPartOfRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 1) {
            System.out.println(n);
            return;
        }
        System.out.println(sqrt(n));
    }
    static int sqrt(int n)
    {
        int start = 0;
        int end = n;
        int mid =  -1;
        int result =  -1;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if(mid*mid == n)
            {
                return mid;
            }
            else if(mid * mid < n)
            {
                start = mid + 1;
                result = mid; // Storing floor of the number
            }
            else
            {
                end = mid - 1;
            }
        }
        return result;
    }
}
