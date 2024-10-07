import java.util.*;
public class SwapArrays {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,9};
        System.out.println(Arrays.toString(arr));
        swap(arr,3,4);
    }
    static void swap(int a[], int index1, int index2)
    {
        int temp;
        temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
        System.out.println(Arrays.toString(a));
    }
}
