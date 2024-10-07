import java.util.*;
public class EvenDigitCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={12,345,2,6,7896};
        int i,j,count=0,dig=0;
        int temp;
        for(i=0;i<arr.length;i++)
        {
            temp=arr[i];
            while(temp>0)
            {
                temp=temp/10;
                dig++;
            }
            if(dig%2==0)count++;

        }
        System.out.println("Output : "+count);
    }
}
