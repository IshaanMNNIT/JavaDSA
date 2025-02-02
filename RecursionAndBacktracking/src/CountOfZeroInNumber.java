public class CountOfZeroInNumber {
    public static void main(String[] args) {
        int n = 3020400;
        if(n == 0)
        {
            System.out.println("Zero Counter : 0");
            return;
        }
        int count = ZeroCounter(n , 0);
        System.out.println("Zero Counter : " + count);
    }
    static int ZeroCounter(int n , int count)
    {
        if(n == 0) return count;
        if(n % 10 == 0) count++;
        return ZeroCounter(n/10,count);
    }
}
