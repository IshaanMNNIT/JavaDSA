public class Sum_of_range {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sum(n));
    }
    static int sum(int n)
    {
        if(n <= 1)return n;
        return n + sum(n-1);
    }
}
