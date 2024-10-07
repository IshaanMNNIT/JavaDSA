import java.util.*;
public class lastOccurenceBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,1,2,3,3,3,4,4,4,5,5,5};// Length = 12
                // 0 1 2 3 4 5 6 7 8 9 10 11
        int target = in.nextInt(); //Let target be equal to 4

        int s=0;
        int e=arr.length-1;// e = 11
        int mid;int index=-1;
        while(s<=e)
        { // target = 4
            mid = (s+e)/2; //(i> mid = 5 and arr[5] = 3)
            if(arr[mid]==target)
            {
                if(mid!=arr.length-1) {
                    if (arr[mid + 1] == arr[mid])
                    {
                        s = mid + 1;
                        continue;
                    } else {
                        index = mid;
                        break;
                    }
                }
                else{
                    index = arr.length - 1;break;
                }
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else {
                s = mid + 1;
            }
        }
        if(index!=-1)
            System.out.println("Last Occurence = "+index);
        else
            System.out.println("Not Found ");
    }
}
