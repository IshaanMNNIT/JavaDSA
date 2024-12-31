import java.sql.SQLOutput;
import java.util.Arrays;

public class LinearSearchInTwoDimensionalArrayRevisit {
    public static void main(String[] args) {
        int arr[][] = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target = 34;
        int ans[] = search(arr,target);
        if(ans[0]!=-1)
            System.out.println("Found At : "+ Arrays.toString(ans));
        else
            System.out.println("Not Found");
        System.out.println("Maximum of the array : "+Maxima(arr));
    }
    // Searching for given target
    static int[] search(int arr[][],int target)
    {
        for(int rows=0;rows<arr.length;rows++)
        {
            for(int cols=0;cols<arr[rows].length;cols++)
            {
                if(arr[rows][cols] == target)
                {
                    return new int[]{rows,cols};
                }
            }
        }return new int[]{-1,-1};
    }

    //Searching for max element in 2D Array
    static int Maxima(int arr[][])
    {
        int max = Integer.MIN_VALUE;
        for(int [] i : arr)
        {
            for(int element : i)
            {
                if(max<element)
                    max = element;
            }
        }return max;
    }
}
