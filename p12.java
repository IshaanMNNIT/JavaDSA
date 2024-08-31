import java.util.*;
public class p12 {
    void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Sum of Entered Numbers : "+(m+n));
    }

    public static void main(String[] args) {
        p12 obj = new p12();
        obj.sum();


    }
}
