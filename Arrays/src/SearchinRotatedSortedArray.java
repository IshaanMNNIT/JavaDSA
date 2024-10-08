import java.util.Arrays;
import java.util.Scanner;
class SearchinRotatedSortedArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {4,6,8,9,1,2,3}; // key = 3
        System.out.println("Rotated Matrix : "+ Arrays.toString(arr)+"\nEnter the target");
        int target = in.nextInt();
        int key=findKey(arr);
        if(search(0,arr.length-1-key ,arr,target)!=-1)
        {
            System.out.println(search(0,arr.length-1-key ,arr,target));
        }
        else
        {
            System.out.println(search(arr.length-1-key,arr.length-1 ,arr,target));
        }


    }
    static int findKey(int arr[])
    {
        int key=0;
        int s=0,e=arr.length-1,mid;
        while(true) {
            mid = (s + e) / 2;
            if (arr[0] > arr[1])
            {
                mid = 0;
                break;
            }
            if(mid == arr.length - 1)
            {
                break;
            }
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            {
                break;
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
        key = arr.length - mid -1;
        return key;
    }
    static int search(int s,int e,int arr[],int target)
    {
        int index = -1;
        int mid;
        while(s<=e)
        {
            mid = (s + e) / 2;
            if (arr[mid] == target)
            {
                index = mid; break;
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return index;
    }

}