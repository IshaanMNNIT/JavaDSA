package Arrays;

public class LongestSubarraywithsumkPos {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1,1,1,3,3};
        int len = -1;
        int k = 6;
        int sum = arr[0];
        int l = 0,r = 0;
        while(r < arr.length){
            while(l <= r && sum > k)
            {
                sum -= arr[l];
                l++;
            }
            if(sum == k)
                len = Math.max(len,r-l+1);
            r++;
            if(r < arr.length) sum += arr[r];
        }
        System.out.println(len);
    }
}
