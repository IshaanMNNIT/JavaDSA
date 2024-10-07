import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]=new int[in.nextInt()];
        int i,j;
        for(i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sort(a);
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the target : ");
        int target = in.nextInt();
        BSearch(a,target);

    }
    static int []sort(int arr[])
    {
        int i,j;
        int temp;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static void BSearch(int a[],int t)
    {
        int s=0,e=a.length-1;
        int mid;int flag = 0;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(t>a[mid])
            {
                s=mid+1;

            }
            else if(t<a[mid])
            {
                e=mid-1;
            }
            else if (t==a[mid])
            {
                System.out.println("Found It at Index : "+mid);
                flag=1;break;
            }
        }
        if(flag==0)
            System.out.println("Cannot be found!!");
    }
}
