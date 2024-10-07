import java.util.*;
import java.util.function.DoubleToIntFunction;

public class ArraysProg3 { //Multi Dimensional Arrays Basic I/O and some functions
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       //Rows is mandatory but columns is not
        int arr[][]={{1,2,3,4},{5,6,6,7},{5,7,8,9}};
        //Way One
        for(int rows=0;rows< arr.length;rows++)
        {
            System.out.print(Arrays.toString(arr[rows]));
            System.out.println();
        }
        //Way Two
        for(int a[]:arr)
        {
            System.out.print(Arrays.toString(a));
            System.out.println();
        }

    }
}