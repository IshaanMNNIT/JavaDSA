import java.util.*;
public class SquareRootUptoDecimalPlaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 1) {
            System.out.println(n);
            return;
        }
        System.out.println("Enter the precision : ");
        int p = in.nextInt();
        System.out.println(sqrt(n , p));
    }
    static double sqrt(int n , int p)
    {
        double start = 0;
        double end = n;
        double mid;
        double result = 0.0;
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
        // Result Only Contains Greatest Integer of actual root
        double increment = 0.1;
        for(int i = 0 ; i < p ; i++)
        {
            while(result * result <= n)
            {
                result += increment;
            }
            result -= increment;
            increment/=10;
        }
        return result;
    }
    // Time Complexity = O(log(n))
}
