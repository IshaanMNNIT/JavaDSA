import java.util.*;
public class SelectionSort {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array ");
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]= in.nextInt();
        }
        System.out.println("Given array : "+Arrays.toString(arr));
        System.out.println("Sorted Arrays : "+Arrays.toString(sort(arr)));
    }
    static int []sort(int arr[])
    {
        int i , j , pos , max , temp;
        for(i=arr.length-1;i>=0;i--)
        {
            pos=i;
            max=arr[i];
            for(j=0;j<i;j++)
            {
                if(max<arr[j])
                {
                    pos = j;
                    max = arr[j];
                }
            }
            temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;

        }
        return arr;
    }
}
