import java.util.*;
public class CycleSortWithMissingNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array from range 0 to size of the array");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Given array : " + Arrays.toString(arr));
        arr=sort(arr);
        System.out.println("Missing Number : "+missing(arr));
    }
    static int[]sort(int arr[])
    {
        int i=0 , temp  ;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }
    static int missing(int arr[])
    {
        for(int i = 0 ; i < arr.length ;i++)
        {
            if(arr[i] != i ) return i;

        }
        return arr.length;
    }
}