import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array ");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Given array : " + Arrays.toString(arr));
        System.out.println("Sorted Arrays : " + Arrays.toString(sort(arr)));
    }
    static int[] sort(int arr[])
    {
        int i,j,temp;
        for(i=0;i<=arr.length-2;i++)
        {
            for(j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        return arr;
    }
}

