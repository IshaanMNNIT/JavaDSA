import java.util.*;//Largest among three Numbers Using Math.max
class p5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int max;
        max=Math.max(a,b);
        max=Math.max(max,c);
        System.out.println("Largest Number : "+max);
    }
}