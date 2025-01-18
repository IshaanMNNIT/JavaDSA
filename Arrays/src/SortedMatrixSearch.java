import java.util.*;
public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[in.nextInt()][in.nextInt()];
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Given Array : ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Enter the target : ");
        int target = in.nextInt();
        System.out.println("Present at : " + Arrays.toString(search(arr, target)));
    }
    static int[] binarySearch(int [][] matrix, int row ,int cStart,int cEnd,int target)
    {
        while(cStart<=cEnd)
        {
            int mid = (cStart+cEnd)/2;
            if(matrix[row][mid] == target)
            {
                return new int[]{row,mid};
            }
            else if(matrix[row][mid] < target)
                cStart = mid+1;
            else
                cEnd = mid-1;
        }
        return new int[]{-1,-1};
    }
    // For Rest the arrays remaining we have made binary search as it is !!
    static int[] search(int [][]arr , int target)
    {
        int rows = arr.length;
        int cols = arr[0].length; // Be cautious, matrix may be empty

        if(rows == 1)
        {
            binarySearch(arr,0,0,cols - 1,target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        //Run the loop till two rows are remaining
        while( rEnd - rStart > 1) // Till two rows are remaining
        {
            // While this is true matrix will have more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if(arr[mid][cMid] == target)
            {
                return new int[] {mid,cMid};
            } else if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        //Now we have two rows
        //Check whether target is in the two rows and in the cMid Column
        if(arr[rStart][cMid] == target)
        {
            return new int[]{rStart,cMid};
        }
        if(arr[rStart][cMid] == target)
        {
            return new int[]{rStart + 1 , cMid};
        }

        // Now Check for 4 arrays left
        // First Half
        if(target <= arr[rStart][cMid - 1])
        {
            return binarySearch(arr, rStart, 0, cMid - 1, target);
        }
        else if(target <= arr[rStart + 1][cMid - 1])
        {
            return binarySearch(arr,rStart+1,0,cMid - 1,target);
        }
        else if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        else
        {
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}