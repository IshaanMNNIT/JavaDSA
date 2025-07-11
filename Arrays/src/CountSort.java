import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int arr[] = {3,4,1,3,2,5,2,8};
        int max = Integer.MIN_VALUE;
        for(int n : arr)
        {
            if(max < n) max = n;
        }

        int freq[] = new int[max + 1];
        for(int num : arr){
            freq[num] ++;
        }
        int index = 0;
        for(int i = 0 ; i < freq.length ; i++){
            while(freq[i] > 0){
                arr[index] = i;
                index++;
                freq[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
