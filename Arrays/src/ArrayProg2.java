import java.util.*;
public class ArrayProg2 { //Arrays Passing in a Function
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,2,4,5,3,4,5};
        func(arr);
        System.out.println(Arrays.toString(arr));//Pass By Reference
    }
    static void func(int a[])
    {
        a[0]=99;
        System.out.println(Arrays.toString(a));
    }
}
