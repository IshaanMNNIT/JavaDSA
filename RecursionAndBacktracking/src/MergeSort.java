import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        arr = sort(arr);
        System.out.println("Sorted : " + Arrays.toString(arr));
    }
    static int []sort(int arr[])
    {
       if(arr.length == 1)
       {
           return arr;
       }
       int mid = arr.length / 2;
       int left[] = sort(Arrays.copyOfRange(arr,0,mid));
       int right[] = sort(Arrays.copyOfRange(arr,mid, arr.length));
       return merge(left,right);
    }
    static int[] merge(int [] left, int[] right)
    {
        int mix[] = new int[left.length + right.length];
        int i , j;
        i = 0;
        j = 0;
        int k = 0;
        while(i < left.length && j < right.length)
        {
            if(left[i] < right[j])
            {
                mix[k] = left[i];
                i++;
            }
            else
            {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length)
        {
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < left.length)
        {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}