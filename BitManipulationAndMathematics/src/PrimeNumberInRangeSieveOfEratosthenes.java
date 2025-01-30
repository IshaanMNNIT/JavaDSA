import java.util.*;
// Printing All Prime Numbers from 2 till n
public class PrimeNumberInRangeSieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean []arr = new boolean[n+1];
        sieve(n,arr);
    }
    // Prime Numbers will be marked as false in the boolean Array
    static void sieve(int n, boolean []prime)
    {
        for(int i = 2 ; i*i<=n ;i++)
        {
            if(!prime[i])
            {
                for(int j = i * 2 ; j <= n ; j+=i)
                {
                    prime[j] = true;
                }
            }
        }
        for(int i = 2 ; i <= n ; i++)
        {
            if(!prime[i])
                System.out.print(i + " ");
        }
    }
}
