public class FactorsBruteForce {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1 ; i <= n ; i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
