import java.util.*;
public class RowColSortedMatSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[in.nextInt()][in.nextInt()];
        int i,j;
        for(i = 0 ; i < arr.length ; i++)
        {
            for( j = 0 ; j < arr[i].length ; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Given Array : ");
        for(i = 0 ; i < arr.length ; i++)
        {
            for( j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Enter the target : ");
        int target = in.nextInt();
        System.out.println("Present at : " + Arrays.toString(searchMatrix(arr,target)));
    }
    static int[] searchMatrix(int [][]arr , int target)
    {
        int r = 0;
        int c = arr.length - 1;
        while(r < arr.length && c >= 0)
        {
            if(arr[r][c] == target)
            {
                return new int[]{r,c};
            }
            else if(arr[r][c] > target)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
