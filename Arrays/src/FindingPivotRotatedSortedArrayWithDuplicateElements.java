import java.util.*;
public class FindingPivotRotatedSortedArrayWithDuplicateElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        int pivot = findingPivotWithDupilicates(arr);
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Given Array : "+Arrays.toString(arr));
        System.out.println("Pivot is :" + pivot);
    }
    static int findingPivotWithDupilicates(int arr[])
    {
        int start , mid , end ;
        start = 0;
        end = arr.length - 1;
        while(start < end)
        {
            mid = start + (end - start)/2;
            // 2 Cases just like for unique elements
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
