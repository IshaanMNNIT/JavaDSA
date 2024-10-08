public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5,6,7,8,6,5,4,3,2,1,0};
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
        System.out.println(i+" is the Peak Element.");
    }
}
