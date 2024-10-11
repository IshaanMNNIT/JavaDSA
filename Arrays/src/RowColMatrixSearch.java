import java.util.*;
public class RowColMatrixSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt(); //Let target = 37
        int arr[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int row=0,col=arr.length-1;
        given(arr);
       while(col>=0 && row<arr.length)
       {
           if(arr[row][col]==target)
           {
               System.out.println("Found It At : ["+row+","+col+"]");
               System.exit(0);
           }
           else if(arr[row][col]>target)
           {
               col--;
           }
           else
           {
               row++;
           }
       }

        System.out.println("Not Found !");
    }
    static void given(int arr[][])
    {
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

}
