import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,5,5,5,6,6,6,7,8,9,10,10};
        System.out.println("Given Array  : "+ Arrays.toString(arr));
        int i,j,k;
        ArrayList <Integer> list = new ArrayList<>(10);
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    if(list.contains(arr[i])==false)
                        list.add(arr[i]);

                }

            }
        }
        System.out.println(list);
    }

}
