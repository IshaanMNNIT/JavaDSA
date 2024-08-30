import java.util.*;//Largest Amongst the Three given Numbers
public class p3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int max;

        if(b>a && b>c)
            System.out.println("Largest Number is : "+b);
        else if(a>b && a>c)
            System.out.println("Largest Number is : "+a);
        else
            System.out.println("Largest Number is : "+c);


    }
}