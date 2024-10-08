import java.util.*;
public class Rotatingthesorted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int arr[] = new int[in.nextInt()];
        System.out.println("Enter the elements in ascending order ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Given array : \n"+Arrays.toString(arr));
        System.out.println("Enter the index about which array should be rotated");
        int key = in.nextInt();
        rotate(arr,key);
    }
    static void rotate(int arr[],int key )
    {
        int a[]=new int[arr.length];
        int i;
        int b=0;
        for(i=0;i<a.length;i++)
        {
            if(key<arr.length)
            {
                a[i]=arr[key];key++;
            }
            else
            {
                a[i]=arr[b];b++;
            }
        }
        System.out.println("Rotated Array : "+Arrays.toString(a));
    }
}
