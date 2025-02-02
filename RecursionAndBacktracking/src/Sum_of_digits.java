public class Sum_of_digits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println("Sum of Digits : " + SumOfDigits(n));
    }
    static int SumOfDigits(int n)
    {
        if(n == 0) return 0;
        return n % 10 + SumOfDigits(n/10);
    }
}
