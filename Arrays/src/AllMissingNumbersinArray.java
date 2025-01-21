import java.util.*;
public class AllMissingNumbersinArray {
    public static void main(String[] args) {
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
        arr = sort(arr);
        System.out.println("After cyclic sort : " + Arrays.toString(arr));
        System.out.println("Missing Number : " + missingNumbers(arr));
    }

    static int[] sort(int arr[]) {
        int i = 0, temp;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        return arr;
    }
    static ArrayList<Integer> missingNumbers(int arr[])
    {
        ArrayList<Integer> l = new ArrayList<>(10);
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] != i + 1)
            {
                l.add(i + 1);
            }
        }
        return l;
    }
}