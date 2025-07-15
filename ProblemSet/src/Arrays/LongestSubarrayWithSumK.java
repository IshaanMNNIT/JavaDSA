package Arrays;
import java.util.*;
// For all numbers including positives, negatives and zeroes
public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int len = -1;
        // Brute
            // Generate all subarrays and find the longest subarray with sum k
//            for(int i = 0 ; i < arr.length ; i++){
//                for(int j = i ; j < arr.length ; j++)
//                {
//                    int sum = 0;
//                    for(int kt = i ; k < j ; k++){
//                        sum+=arr[kt];
//                    }
//                    if(sum == k)
//                    {
//                        len = Math.max(len,j-i+1);
//                    }
//                }
//            }
//            System.out.println(len);
//        // Better
                // Better involves O(N*N)
//                    len = -1
//                    for(i = 0 ; i < n ; i++)
//                    {
//                        for(j = i ; j < n ; j++)
//                        {
//                            s+=arr[j]
//                            c++
//                            if(s == k) {
//                                len = max(len, c)
//                                break inner loop
//                            }
//                        }
//                    }
        // Optimal -- Prefix Sum
            // Works for all types of elements in the array
            HashMap<Long,Integer> map = new HashMap<>();
            long sum = 0l;
            int max = -1;
            for(int i = 0 ; i < arr.length ; i++)
            {
                sum+=arr[0];
                if(sum == k)
                {
                    max = Math.max(max,i+1);
                }
                long rem = sum - k;
                if(map.containsKey((rem)))
                {
                    len = i - map.get(rem);
                    max = Math.max(len,max);
                }
                if(!map.containsKey(sum))
                {
                    map.put(sum,i);
                }
            }
            System.out.println(max);

    }
}
