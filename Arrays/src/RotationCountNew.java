import java.util.*;
public class RotationCountNew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        int count;
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Given Array : " + Arrays.toString(arr));
        count = findRotationCount(arr);
        System.out.print("Rotation Count : " + count);
    }
    static int findRotationCount(int arr[])
    {
        int start, mid, end;
        start = 0;
        end = arr.length - 1;
        while(start <= end)
        {
            mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr [mid + 1])
            {
                return mid + 1;
            }
            if(start < mid && arr[mid] < arr[mid - 1])
            {
                return mid;
            }
            if(arr[start] < arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return 0;
    }
}
