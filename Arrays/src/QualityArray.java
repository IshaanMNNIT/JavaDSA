import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QualityArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);int N = in.nextInt();
        int A[] = new int[N];
        ArrayList<Integer> list = new ArrayList<>(); // specify the type parameter (e.g., Integer)
        System.out.println("Enter the Fuckin elements");
        for(int i = 0 ; i < N ; i++)
        {
            A[i] = in.nextInt();
        }
        System.out.println("Given Array "+Arrays.toString(A));
        for(int i = 0 ; i < N ; i++)
        {
            if(IsGoodNumber(A[i]))
            {
                list.add(A[i]);
            }

        }
        System.out.println("Quality Array : "+ list);
    }
    static boolean IsGoodNumber(int n)
    {
        if(n==0)
        {
            return false;
        }
        else if(n % 2 != 0)
        {
            return false;
        }
        else
        {
            int countodd=0;
            for(int i = 2 ; i < n ; i++)
            {
                if(n%i==0 && i%2!=0)
                {
                    countodd++;
                }

                if(countodd >= 1)
                    return true;

            }
        }

        return false;
    }
}
