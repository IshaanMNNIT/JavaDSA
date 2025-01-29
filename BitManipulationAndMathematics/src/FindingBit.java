import java.util.*;
public class FindingBit {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int i = in.nextInt();
        System.out.println("Answer : " + ((num & (1 << (i-1))) >> (i - 1)));
    }
}
