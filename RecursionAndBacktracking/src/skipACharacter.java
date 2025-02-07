import java.util.*;
public class skipACharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = in.next();
        skip("",str);
        System.out.println(skip(str));

    }
    static void skip(String ans , String s) // Passing Two Arguments
    {
        if(s.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        if(s.charAt(0) == 'a')
        {
            skip(ans,s.substring(1));
        }
        else
        {
            skip(ans + s.charAt(0),s.substring(1));
        }
    }
    static String skip(String s) // Passing Original String ONLY
    {
        if(s == "")
        {
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a')
        {
            return skip(s.substring(1));
        }
        else
        {
            return ch + skip(s.substring(1));
        }
    }
}
