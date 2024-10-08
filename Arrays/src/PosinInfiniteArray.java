import java.util.*;
public class PosinInfiniteArray
{//Infinite Array Ka matlab we cannot use length function

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Infinite array");
        int arr[]={2,3,5,6,7,8,10,11,12,15,20,23,30,31,32,33,34,35,36,37,38,39,40};int target = 15;
        System.out.println("Assumed Infinite Length Array : "+Arrays.toString(arr));
        int i;
        int s;
        int e;
        boolean t = true;
        for(i=0;true;i++) //Steps in which chunks are made
        {
            s=i;
            e=(int)(Math.pow(2,i));
            if(arr[s]<=target && target<=arr[e])
            {
                while(s<=e)
                {
                    int mid = (s+e)/2;
                    if(arr[mid]==target)
                    {
                        System.out.println("Found At Position : "+mid);break;
                    }
                    else if(arr[mid]<target)
                    {
                        s=mid+1;
                    }
                    else
                    {
                        e=mid-1;
                    }

                }
            }
        }

    }


}
