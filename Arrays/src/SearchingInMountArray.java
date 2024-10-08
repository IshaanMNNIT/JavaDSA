import java.util.*;
public class SearchingInMountArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,3,1};
        int i = peak(arr);
        System.out.println("Peak Element : "+i);
        System.out.println("Input the Fucking Target : ");
        int target = in.nextInt();
        int index;
        index = searchAsc(arr,target);
        if(index != -1) System.out.println("Index : "+index);
        else
        {
            index = searchDes(arr,target);
            System.out.println("Index : "+index);
        }
    }
    static int peak(int arr[])
    {
        int i=-1 ,s=0,e=arr.length-1,mid;
        while(true)
        {
            mid = (s+e)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            {
                i=arr[mid];break;
            }
            else if(arr[mid-1]>arr[mid])
            {
                e=mid-1;
            }
            else if(arr[mid]<arr[mid+1])
            {
                s=mid+1;
            }

        }
        return i;
    }
    static int searchAsc(int arr[],int target)
    {
        int s=0;
        int e=peak(arr);
        int mid;
        while(s<=e)
        {
          mid = (s+e)/2;
          if(arr[mid]==target) return mid;
          else if(arr[mid]>target) e=mid-1;
          else s=mid+1;
        }
        return -1;
    }
    static int searchDes(int arr[],int target)
    {
        int s=peak(arr);
        int e=arr.length;
        int mid;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) s=mid+1;
            else e=mid-1;
        }
        return -1 ;
    }
}
