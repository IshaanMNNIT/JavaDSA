import java.util.*;
public class PalinDromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        str = str.toLowerCase();
        if(isPalin(str))
            System.out.println("Palindrome !");
        else
            System.out.println("NAAAA !");
    }
    static boolean isPalin(String str)
    {
        String rev="";
        int l =str.length();
        for(int i = l-1 ; i >=0 ; i--)
        {
            rev+=str.charAt(i);
        }
        if(rev.equals(str))return true;
        return false;
    }
}
