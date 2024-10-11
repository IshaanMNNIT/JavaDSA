import java.util.*;
public class BubbleSort {
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
    static int []sort(int arr[])
    {
        int i,j,temp;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        return arr;
    }
}