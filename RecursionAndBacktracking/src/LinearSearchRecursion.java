import java.util.*;
public class LinearSearchRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the Elements");
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the Target : ");
        int target = in.nextInt();
        System.out.println("Found at Index : " + Search(arr,target,0));

    }
    static int Search(int arr[] , int target , int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == target)
        {
            return i;
        }
        return Search(arr,target,i+1);
    }
}
