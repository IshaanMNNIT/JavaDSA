package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,4,5,3,2};
        int largest = arr[0], slargest = -1;
        for(int i = 1 ; i < arr.length ; i++){
            if(largest < arr[i])
            {
                slargest = largest;
                largest = arr[i];
            }
            else if(largest > arr[i] && slargest < arr[i]){
                slargest = arr[i];
            }
        }
        System.out.println("Second Largest : " + slargest);
    }
}
