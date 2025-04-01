import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//        sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }

    static void sort(int[] numbs, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;

        int m = s + (e - s) / 2;
        int pivot = numbs[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (numbs[s] < pivot) {
                s++;
            }
            while (numbs[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = numbs[s];
                numbs[s] = numbs[e];
                numbs[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(numbs, low, e);
        sort(numbs, s, high);
    }
}