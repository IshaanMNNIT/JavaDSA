import java.util.*;
public class NewtonSQRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        n = in.nextDouble();
        System.out.println("Square Root of " + n + " : " + sqrt(n));
    }
    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5) {
                break;
            }

            x = root;
        }
        return root;
    }
}
