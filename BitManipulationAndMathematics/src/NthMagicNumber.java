import java.util.*;
public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int nmagic = 0;
        for(int i = 0 ; i < 32 ; i++)
        {
            nmagic = nmagic + ((n >> i) & 1) * (int)(Math.pow(5,i+1));
        }
        System.out.println("Corresponding Magic Number = " + nmagic);
    }
}
