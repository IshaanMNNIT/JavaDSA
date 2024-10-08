import java.util.*;
public class RotationCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {4,5,6,8,9,0,1,2,3};
        System.out.println(getkey(arr));
        System.out.println("Rotation Count : "+(arr.length-getkey(arr)));
    }
    static int getkey(int arr[])
    {
        int key = -1;
        int s=0,e=arr.length-1,mid;
        if(arr[0]>arr[1])
        {
            key = arr.length - 1;
            return key;
        }

        else
        {
            while(true)
            {
                mid=(s+e)/2;
                if(mid==arr.length-1)break;
                if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
                {
                    break;
                }
                else if(arr[mid-1]>arr[mid])
                {
                    mid--;
                    break;
                }

                else if(arr[mid]<arr[mid+1])
                {
                    s=mid+1;
                }
            }
        }key=arr.length-1-mid;

        return key;

    }

}
