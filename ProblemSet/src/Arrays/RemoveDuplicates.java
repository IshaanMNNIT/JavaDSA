package Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};

//        // Brute Force --- Using Set
//        TreeSet<Integer> s = new TreeSet<>();
//        for(int i = 0 ; i < arr.length ; i++){
//            s.add(arr[i]);
//        }
//        int index = 0;
//        Iterator<Integer> it = s.iterator();
//        while(it.hasNext()){
//            arr[index] = it.next();
//            index++;
//        }
     // Optimal Solution
        int i;
        int k = 0;
        for(i = 1 ; i < arr.length ; i++)
        {
            if(arr[i-1] != arr[i])
            {
                arr[++k] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
