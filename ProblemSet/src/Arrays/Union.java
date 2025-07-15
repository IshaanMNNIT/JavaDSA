package Arrays;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        // Brute : Use two sets to get unique of both the array and then add it to Final Answer
        // Optimal :
        int arr1[] = {1,1,2,3,4,5};
        int arr2[] = {2,3,4,4,5,6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        ArrayList<Integer> un = new ArrayList<>();
        int i,j;
        i = 0;
        j = 0;
        while(i < n1 && j < n2)
        {
            if(arr1[i] <= arr2[j]){
                if(un.size() != 0 && (un.get(un.size() - 1) == arr1[i]))
                {
                    i++;
                    continue;
                }
                else{
                    un.add(arr1[i]);
                    i++;
                }
            }
            else
            {
                if(un.size() != 0 && (un.get(un.size() - 1) == arr2[j]))
                {
                    j++;
                    continue;
                }
                else{
                    un.add(arr2[j]);
                    j++;
                }
            }
        }
        while(i < n1){
            if(un.size() != 0 && (un.get(un.size() - 1) == arr1[i]))
            {
                i++;
            }
            else{
                un.add(arr1[i]);
                i++;
            }
        }
        while(j < n2){
            if(un.size() != 0 && (un.get(un.size() - 1) == arr2[j]))
            {
                j++;
                continue;
            }
            else{
                un.add(arr2[j]);
                j++;
            }
        }
        System.out.println(un);
    }
}
