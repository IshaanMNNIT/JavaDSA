package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,2,0,0,4,5,1};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        // Brute Force
//        int ct = 0;
//        for(int i = 0; i < n ; i++)
//        {
//            if(arr[i] != 0)
//                list.add(arr[i]);
//        }
//        for(int i = 0 ; i < list.size() ; i++)
//        {
//            arr[i] = list.get(i);
//        }
//        for(int i = list.size() ; i < n ; i++){
//            arr[i] = 0;
//        }

        // Optimal Solution
        int i,j;
        i = 0;
        j = 0;
        while(i < n && j < n){
            if(arr[i] != 0 && arr[j] != 0){
                i++;
                j++;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 0 && arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
