import java.util.*;
public class LinearSearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //Linear Searching in String
        //Character Search
        System.out.println("Enter the character to be searched : ");
        char ch = in.next().charAt(0);
        if(ls(s,ch)==-1)
        {
            System.out.println("Not Found !!!");
        }


    }

    static int ls(String str , char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                System.out.println("Found It at Index : "+i);
                return i;
            }

        }
        return -1;
    }

}
