import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = in.nextInt();
        if(isOdd(n))
            System.out.println("Odd Number !");
        else
            System.out.println("Even Number !");
    }
    static boolean isOdd(int n)
    {
        return (n & 1) == 1;
    }
}
