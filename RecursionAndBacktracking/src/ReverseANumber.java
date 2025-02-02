public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1824;
        int s = 0;
        s = reverse(n , s);
        System.out.println("Reverse : " + s);
    }
    static int reverse(int n , int s)
    {

        if(n == 0)return s;
        s = s * 10 + n % 10;
        return reverse(n/10,s);
    }
}
