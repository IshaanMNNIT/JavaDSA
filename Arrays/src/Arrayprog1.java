import java.util.Arrays;
import java.util.Scanner;
public class Arrayprog1 {//Basic I/O in single dimensional arrays
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};//One way of taking input in Single Dimensional Array
        //Way One (Basic For Loop)
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Way Two (Enhanced For loop) (For Each Loop)
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();
        //Way Three (Using toStrings Function in Arrays Wrapper Class)
        System.out.println(Arrays.toString(arr));

    }
}
