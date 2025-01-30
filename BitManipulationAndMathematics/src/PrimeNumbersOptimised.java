public class PrimeNumbersOptimised {
    public static void main(String[] args) {
        int n = 41; // If n = 1 or 0 then not prime
        if(n <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }
        if(isPrime(n))
            System.out.println("Prime Number ");
        else
            System.out.println("Not a prime number");
    }
    static boolean isPrime(int n)
    {
        for(int i = 2 ; i * i < n ; i++)
        {
            if(n % i == 0)return false;
        }
        return true;
    }
}
