import java.util.ArrayList;

public class TakingUnionOftwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5,5,7};
        int arr2[] = {3,4,6};
        int max = arr1[arr1.length - 1]>arr2[arr2.length - 1]?arr1[arr1.length - 1]:arr2[arr2.length - 1];
        ArrayList<Integer> ls = new ArrayList<>(10);
        int i,j,k;
        ls.add(max + 1);
        for(i = 0 , j = 0 , k = 0; i < arr1.length && j < arr2.length ; )
        {
            if(arr1[i] < arr2[j])
            {
                if(ls.get(k) != arr1[i])
                {
                    ls.add(arr1[i]); k++;
                }
                i++;
            }
            else if(arr1[i] == arr2[j])
            {
                if(ls.get(k) != arr1[i])
                {
                    ls.add(arr1[i]); k++;
                }
                i++;
                j++;
            }
            else
            {
                if(ls.get(k) != arr2[j])
                {
                    ls.add(arr2[j]);k++;
                }
                j++;
            }
        }ls.add(max);ls.remove(0);
        System.out.println(ls);
    }
}
