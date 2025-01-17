import java.util.*;
public class FindingPivotRotatedSortedArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        int pivot;
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        pivot = findPivot(arr);
        System.out.println("Given Array : "+Arrays.toString(arr));
        System.out.println("Pivot is :" + pivot);
    }
    static int findPivot(int arr[] )
    {
        int start,mid,end,pivot;
        start = 0;
        end = arr.length - 1;
        pivot = -1;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            // Four Cases
            if(mid<end && arr[mid]>arr[mid+1])
            {
                pivot = mid;
                break;
            }
            if(start<mid && arr[mid]<arr[mid-1])
            {
                pivot = mid - 1;
                break;
            }
            if(arr[start] < arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }

        }return pivot;
    }
}


