import java.util.*;
public class rotatingarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[]{0,1,2,3,4,5,6,7,8};
        System.out.println("Enter the key index about which it needs to be rotated");
        int k = in.nextInt();
        int l = arr.length;int temp;
        if(k>l)
        {
            k = k % l;
        }
        for(int i=1;i<=k;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
