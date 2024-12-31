import java.util.*;
public class NumbersWithEvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums[] = new int[in.nextInt()];
        System.out.println("Enter the elements : ");
        for(int i=0;i< nums.length;i++)
        {
            nums[i] = in.nextInt();
        }
        System.out.println("Given Array : "+Arrays.toString(nums));
        System.out.println("Count : "+findnumbers(nums));
    }
        public static int findnumbers(int nums[])
        {
            int flag=0;
            for(int i=0;i<nums.length;i++)
            {
               int count = String.valueOf(Math.abs(nums[i])).length();
               if(count%2==0)
                   flag++;

            }return flag;
        }
}
