public class SearchInString {
    public static void main(String[] args) {
        String str = "Kunal";
        char target = 'u';
        if(Search(str,target))
        {
            System.out.println("Found IT");
        }
        else
            System.out.println("NAAA");
    }
    static boolean Search(String str , char target)
    {
        if(str.length()==0)
            return false;
        for(int i=0;i<str.length();i++)
        {
            if(target == str.charAt(i))
                return true;
        }return false;
    }
}
