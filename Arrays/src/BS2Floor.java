import java.util.*;
public class BS2Floor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {2,3,5,9,14,16,18};//Sorted Array (Ascending Order)
        System.out.println("Enter the target number");
        int target = in.nextInt();
        floor(arr,target);
    }
    static void floor(int a[],int target)
    {
        int s=0,e=a.length-1,mid=(s+e)/2;
        int flag=0;int ceil=0;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(a[mid]==target)
            {
                ceil=a[mid];flag=1;break;
            }
            else if(a[mid]<target)
            {
                s=mid+1;
            }
            else if(a[mid]>target)
            {
                e=mid-1;
            }
        }
        if(flag==1) System.out.println("Floor = "+ceil);
        else System.out.println("Floor = "+a[e]);
    }
}
