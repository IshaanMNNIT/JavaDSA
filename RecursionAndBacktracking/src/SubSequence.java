import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
//        subseq("",str);
//        System.out.println();
//        ArrayList<String>l = new ArrayList<>();
//        System.out.println(subseq("",str,l));
          System.out.println(subseqRet("","abc"));
    }
    static void subseq(String p , String up)
    {
        if(p.isEmpty() && up.isEmpty())return;
        if(up.isEmpty())
        {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch,up.substring(1));
        subseq(p,up.substring(1));
    }
//    static ArrayList<String> subseq(String p , String up , ArrayList<String> list)
//    {
//        if(p.isEmpty() && up.isEmpty())return list;
//        if(up.isEmpty())
//        {
//            list.add(p);
//        }
//        char ch = up.charAt(0);
//        subseq(p + ch,up.substring(1));
//        subseq(p,up.substring(1));
//        return new ArrayList<>();
//    }
        static ArrayList<String> subseqRet(String p, String up) {
            if (up.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            char ch = up.charAt(0);
            ArrayList<String> left = subseqRet(p + ch, up.substring(1));
            ArrayList<String> right = subseqRet(p, up.substring(1));

            left.addAll(right);
            return left;
        }

}
