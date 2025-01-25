import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;
        int i, j, flag = 1;
        str = in.next();
        str = str.toLowerCase();
        i = 0;
        j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 0;
            }
            i++;
            j--;
        }
        if (flag == 1)
        {
            System.out.println("Palindrome");

        }
        else
        {
            System.out.println("NAAAA !");
        }
    }
}
