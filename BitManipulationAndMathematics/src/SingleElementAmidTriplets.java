import java.util.*;
public class SingleElementAmidTriplets {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Given Array : " + Arrays.toString(arr));
        int count;
        int result = 0;
        for(int i = 0 ; i < 32 ; i++)
        {
            count = 0;
            for(int j = 0 ; j < n ; j++)
            {
                if((((arr[j]) & (1 << i)) >> i) == 1)
                    count++;
            }
            if(count % 3 == 1)
            {
                result += 1 << i;
            }
        }
        System.out.println("Singly Occuring element : " + result);
    }
}
