import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selectionSort(arr,0,1 , 0);
        System.out.println("Sorted : " + Arrays.toString(arr));
    }
    static void selectionSort(int arr[] , int i , int j , int max)
    {
        if(i == arr.length - 1)return;
        if(j <= arr.length - i - 1)
        {
            if(arr[max] < arr[j])
            {
                max = j;
                selectionSort(arr,i,j+1,max);
            }
            else
            {
                selectionSort(arr,i,j+1,max);
            }
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[arr.length - i - 1] ;
            arr[arr.length - i - 1] = temp;
            selectionSort(arr,i+1,0,0);
        }
    }
}
