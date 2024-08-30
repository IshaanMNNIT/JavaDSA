import java.util.*;
class p6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if(ch>=65 && ch<=90)
            System.out.println("Uppercase");
        else if(ch>=97 && ch<=122)
            System.out.println("Lowercase");
        else
            System.out.println("Not an Alphabet");

    }
}