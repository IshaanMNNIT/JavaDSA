import java.util.Scanner;
public class BS3SmallestLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char []ch = {'c','f','g','h','i','j'};
        System.out.println("Enter the target : ");
        char target = in.next().charAt(0);
        System.out.println(sl(ch,target));
    }
    static char sl(char a[],char target)
    {
        int s=0,e=a.length-1;
        int mid=(s+e)/2;
        if (target>=a[e] || target<=a[0]) return a[0];
        else
        {
            while(s<=e)
            {
                mid=(s+e)/2;
                if(a[mid]==target)
                {
                    for(int i = mid ; i < a.length ; i++)
                    {
                        if(a[mid]!=a[i]) return a[i];
                    }
                }
                if(a[mid]<target){
                    s=mid+1;
                }
                if(a[mid]>target){
                    e=mid-1;
                }

            }
        }
        return a[0];

    }
}
