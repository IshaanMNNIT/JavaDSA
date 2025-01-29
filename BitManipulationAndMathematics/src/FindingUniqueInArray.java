public class FindingUniqueInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,1,4,7,4},sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum = sum ^ arr[i];
        }
        System.out.println("Unique Element : " + sum);
    }
}
