package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1)
            {
                count++;
            }
            else
            {
                max = Math.max(max,count);
                count = 0;

            }
        }
        // If max consecutive ones are at the end, max value wont be updated and therefore
        // Final answer should be maximum of max and count
        System.out.println(Math.max(max,count));
    }
}
