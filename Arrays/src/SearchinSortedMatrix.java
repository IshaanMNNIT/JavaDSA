import java.util.*;
public class SearchinSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
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

    static int []search(int [][]matrix ,int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            binarySearch(matrix, 0, 0, cols - 1, target);
        }
        //Run the loop till two rows are remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < rEnd - 1) {
            int mid = (rStart + rEnd) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        //Now We have two rows
        //Check whether the target is in the column of two rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }
}
