import java.util.*;
class p9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an operator");
        char ch = in.next().charAt(0);int a,b;
        switch(ch)
        {
            case '+':
                System.out.println("Enter two numbers ");
                a=in.nextInt();
                b=in.nextInt();
                System.out.println(a+b);
                break;

            case '-':
                System.out.println("Enter two numbers ");
                a=in.nextInt();
                b=in.nextInt();
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("Enter two numbers ");
                a=in.nextInt();
                b=in.nextInt();
                System.out.println(a+b);
                break;
            case '/':
                System.out.println("Enter two numbers ");
                a=in.nextInt();
                b=in.nextInt();
                System.out.println(a/b);
                break;
            case'%':
                System.out.println("Enter two numbers ");
                a=in.nextInt();
                b=in.nextInt();
                System.out.println(a%b);
                break;

            default:
                System.out.println("Invalid Operator Entered");


        }

    }
}