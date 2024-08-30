import java.util.*;//Largest Amongst the Three given Numbers
public class p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int max;
        max=a;
        if(max<b)
        {
            max=b;
        }
        else if(max<c)
        {
            max=c;
        }
        System.out.println("Largest Number is : "+max);

    }
}