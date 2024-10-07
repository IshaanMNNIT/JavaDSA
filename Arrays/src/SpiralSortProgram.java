import java.util.*;
public class SpiralSortProgram  // OP SAWAAL
 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[]=new int[9];
        System.out.println("Enter the nine elements");
        for(int i=0;i<9;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Given Array : "+Arrays.toString(a));
        System.out.println("Sorted Array : "+Arrays.toString(sort(a)));
        int arr[][] = new int[3][3];
        print(a,arr);

    }
    static int [] sort(int arr[])
    {
        int i,j,temp;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        return arr;
    }
    static void print(int a[],int arr[][])
    {
        int top,bottom,left,right,dir,i;
        top=0;
        bottom=2;
        left=0;
        right=2;
        dir = 0 ;
        int key=0;
        while(key<9)
        {
            if(dir==0)
            {
                for(i=left;i<=right;i++)
                {
                    arr[top][i]=a[key++];
                }
                dir=1;
                top++;
            }
            if(dir==1)
            {
                for(i=top;i<=bottom;i++)
                {
                    arr[i][right]=a[key++];
                }
                dir=2;
                right--;
            }
            if(dir==2)
            {
                for(i=right;i>=left;i--)
                {
                    arr[bottom][i]=a[key++];
                }
                dir=3;
                bottom--;
            }
            if(dir==3)
            {
                for(i=bottom;i>=top;i--)
                {
                    arr[i][left]=a[key++];
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


