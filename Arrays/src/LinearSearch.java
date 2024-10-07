import java.util.*;
public class LinearSearch {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Given Array : "+Arrays.toString(arr)+"\nEnter the Target : ");
        int target = in.nextInt();
        int flag = Ls(arr,target);
        if(flag==-1)
            System.out.println("Not Found");
        else
            System.out.println("Found At Index : "+flag);

    }
    static int Ls(int arr[], int target)
    {

        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==target)
                return i;

        }
        return -1;
    }
}
