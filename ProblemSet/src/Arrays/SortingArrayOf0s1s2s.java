package Arrays;

import java.util.Arrays;

public class SortingArrayOf0s1s2s {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        // Brute --> Sort O(NlogN)
        // Count 0s, 1s, 2s and put them in the array accordingly
        // Optimal --> Dutch National Flag Algorithm
        int low,mid,high;
        low = 0;
        mid = 0;
        high = arr.length - 1;
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            }

            else if(arr[mid] == 1)
            {
                mid ++;
            }
            else
            {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
