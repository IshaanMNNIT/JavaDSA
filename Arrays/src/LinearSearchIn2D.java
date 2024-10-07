import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchIn2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][]=new int[3][3];
        System.out.println("Enter the element to be searched : ");
        int t = in.nextInt();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Given Array");
        for(int a[] : arr)
        {
            System.out.println(Arrays.toString(a));

        }
        if(ls(arr,t))
            System.out.println("Not Found");

    }
    static boolean ls(int a[][], int target)
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]==target) {
                    System.out.println("Found at : (" + i + "," + j + ")");
                    return false;
                }
            }
        }
        return true;
    }
}
