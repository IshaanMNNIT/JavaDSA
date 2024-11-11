import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(IsOdd(num))
            System.out.println("Odd Number. ");
        else
            System.out.println("Even Number. ");

    }
    static boolean IsOdd(int num)
    {
        if((num & 1) == 1) return true;
        return false;
    }
}
