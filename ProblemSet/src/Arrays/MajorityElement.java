package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        // Brute --> O(n^2) and we count frequency of each element and return that number whose frequency is greater
        // than N/2
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            int count = 0;
//            for(int j = 0 ; j < arr.length ; j++){
//                if(arr[i] == arr[j])
//                    count++;
//            }
//            if(count > arr.length / 2) {
//                System.out.println(arr[i]);
//                return;
//            }
//        }
//        System.out.println("No Majority Element");
        // Better approach to use frequency HashMaps

        // Optimal
        // Moore's Voting Algorithm
        int ct = 0;
        int el = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(ct == 0) {
                el = arr[i];
                ct = 1;
            }
            else if(el == arr[i]) ct++;
            else ct--;
        }
        // return el if array always has majority element
        // Otherwise check
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == el) ct++;
        }
        if(ct > arr.length / 2) {
            System.out.println(el + " ");
            return;
        }
        System.out.println("Not Found");
    }
}
