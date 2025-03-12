import java.util.*;
public class LinearSearchRecursionMultipleRecurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the Elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the Target : ");
        int target = in.nextInt();
        ArrayList<Integer> list;
        list = Search2(arr,target,0);
        if(list.size() == 0) {
            System.out.println("Not Found !");
            return;
        }
        System.out.println("Found at Index : " + list);
    }
    static ArrayList<Integer> Search(int [] arr , int target , int i, ArrayList<Integer>list) {
        if (i == arr.length) {
           return list;
        }
        if(arr[i] == target)
        {
            list.add(i);
        }
        return Search(arr,target,i+1,list);
    }
    static ArrayList<Integer> Search2(int arr[] , int target ,int i)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
        {
            return list;
        }
        if(arr[i] == target)
        {
            list.add(i);
        }
        list.addAll(Search2(arr,target,i+1));
        return list;
    }
}