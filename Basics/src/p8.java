import java.util.*;
class p8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        long x = in.nextLong();
        if(x>9 || x<0){
            System.out.println("Invalid...Try Again");x=in.nextLong();
        }
        long r,count=0;
        while(num>0)
        {
            r=num%10l;
            if(r==x)count++;
            num/=10l;
        }
        System.out.println(x+" has occured : "+count+" times .");
    }
}