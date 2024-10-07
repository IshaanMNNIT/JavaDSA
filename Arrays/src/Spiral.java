import java.util.*;
public class Spiral
{
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int arr[][]=new int[n][n];// n = 3
        int top , bottom , left , right , dir ;
        int i;
        top = 0 ;
        left = 0 ;
        bottom = n - 1 ;//2
        right = n - 1 ;//2
        dir = 0 ;
        int key=1;
        while(key<=n*n)
        {
            if(dir==0)
            {
                for(i=left;i<=right;i++)
                {
                    arr[top][i]=key++;
                }
                dir=1;
                top++;
            }
            if(dir==1)
            {
                for(i=top;i<=bottom;i++)
                {
                    arr[i][right]=key++;
                }
                dir=2;
                right--;
            }
            if(dir==2)
            {
                for(i=right;i>=left;i--)
                {
                    arr[bottom][i]=key++;
                }
                dir=3;
                bottom--;
            }
            if(dir==3)
            {
                for(i=bottom;i>=top;i--)
                {
                    arr[i][left]=key++;
                }
                dir=0;
                left++;
            }

        }
        print(arr);


    }
    static void print(int arr[][])
    {
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}