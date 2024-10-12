import java.util.*;
public class CycleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array from range 1 to size of the array");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Given array : " + Arrays.toString(arr));
        System.out.println("Sorted Arrays : " + Arrays.toString(sort(arr)));
    }
    static int []sort(int arr[])
    {
        int i ,temp;
        i=0;
        while(i<arr.length)
        {
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else {
                i++;
            }
        }
        return arr;
    }

}
