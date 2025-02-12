import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
//        System.out.println(pad2("","12"));
//        System.out.println(padCount("","12"));
        System.out.println(AnsList("","78"));
    }
    static void pad(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // Converts Character digit '2' to 2
        for(int i = 3 * (digit - 1) ; i < 3 * digit ; i++)
        {
            char ch = (char)('a' + i);
            pad(p + ch,up.substring(1));
        }

    }
    static ArrayList<String> pad2(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 3 * (digit - 1) ; i < 3 * digit ; i++)
        {
            char ch = (char)('a' + i);
            ans.addAll(pad2(p + ch,up.substring(1)));
        }
        return ans;
    }
    static int padCount(String p , String up)
    {

        if(up.isEmpty())
        {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // Converts Character digit '2' to 2
        for(int i = 3 * (digit - 1) ; i < 3 * digit ; i++)
        {
            char ch = (char)('a' + i);
            count = count + padCount(p + ch,up.substring(1));
        }
        return count;
    }

    // Leetcode Function
    public static List<String> letterCombinations(String digits)
    {
        return AnsList("",digits);
    }
    static List<String> AnsList(String p, String up)
    {
        if(up.isEmpty())
        {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        if(digit >= 2 && digit <= 6) {
            for (int i = 3 * (digit - 1); i < 3 * digit; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(AnsList(p + ch, up.substring(1)));
            }
        }
        else if(digit == 7)
        {
            for (int i = 3 * (digit - 2); i <= 3 * (digit - 1); i++) {
                char ch = (char) ('a' + i);
                ans.addAll(AnsList(p + ch, up.substring(1)));
            }
        }
        else if(digit == 8)
        {
            for (int i = 3 * (digit - 2) + 1 ; i <= 3 * (digit - 2) + 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(AnsList(p + ch, up.substring(1)));
            }
        }
        else if(digit == 9)
        {
            for (int i = 3 * (digit - 3) + 4; i <= 3 * (digit - 3) + 7; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(AnsList(p + ch, up.substring(1)));
            }
        }
        return ans;
    }
}


