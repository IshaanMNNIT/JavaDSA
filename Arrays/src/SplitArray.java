import java.util.*;
public class SplitArray {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of n : ");
        int arr[]=new int[in.nextInt()];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Given Array : "+Arrays.toString(arr));
        System.out.println("Enter the value of m : ");
        int m = in.nextInt();
        System.out.println(splitArray(arr,m));

    }
    static int splitArray(int[]nums,int m)
    {
        int start=0,end=0,mid=0,pieces=0,i=0,sum=0;
        for(i=0;i<nums.length-1;i++)
        {
            start=Math.max(nums[i],start);
            end=end+nums[i];
        }

        //Binary Search
        while(start<end)
        {
            //try for middle as potential answer
            mid=(start+end)/2;
            sum=0;
            pieces=1;
            //calculate how many pieces we can divide the array
            for(int num:nums)
            {
               if(sum+num>mid)
               {
                   sum=num;
                   pieces++;
               }
               else
               {
                   sum+=num;
               }
            }

            if(pieces<=m)end=mid;
            if(pieces>m)start=mid+1;
        }
        return end;
    }

}
