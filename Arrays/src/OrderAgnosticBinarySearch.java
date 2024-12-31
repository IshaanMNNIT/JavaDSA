public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int flag = search(arr,target);
        if(flag == 1)
            System.out.println("Found It");
        else
            System.out.println("NAAA");
    }
    static int search(int arr[], int target)
    {
        int start,mid,end;
        start = 0;
        end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start<=end)
        {
            mid = (start+end)/2;
            if(isAsc)
            {
                if(arr[mid]==target)
                {
                    return 1;
                }
                else if(target>arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            else {
                if(arr[mid]==target)
                {
                    return 1;
                }
                else if(target<arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
