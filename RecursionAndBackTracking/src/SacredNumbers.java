import java.util.*;

public class SacredNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            long num = in.nextLong();
            if (isPerfectSquare(num) && num !=1) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }

    static boolean isPerfectSquare(long num) {
        long sqrt = (long) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
