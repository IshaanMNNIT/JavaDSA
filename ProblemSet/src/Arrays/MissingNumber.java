package Arrays;
import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {


        int arr[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        // Range [0 to n = arr.length] == n + 1 numbers
        // Array has n elements and range has n + 1 elements
        // One Element is always missing
        sort(arr);
        int flag = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println(arr.length);
    }
    static void sort(int arr[])
    {
        int i = 0;
        while(i < arr.length){
            int corr = arr[i];
            if(arr[i] != arr.length && arr[i] != arr[corr]){
                int temp = arr[i];
                arr[i] = arr[corr];
                arr[corr] = temp;
            }
            else
            {
                i++;
            }
        }
    }
}
