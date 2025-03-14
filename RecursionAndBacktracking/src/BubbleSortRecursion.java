import java.util.Arrays;
public class BubbleSortRecursion {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        sort(arr,0,0);
        System.out.println("Sorted : " + Arrays.toString(arr));
    }
    static void sort(int arr[] , int i , int j)
    {
        if(i == arr.length - 1)return;
        if(j < arr.length - 1 - i)
        {
            if(arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            sort(arr,i,j+1);
        }
        else
        {
            sort(arr,i+1,0);
        }
    }
}
