public class CheckSorted {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,6,6};
        int flag = Sorted(arr,0);
        if(flag == 1)
            System.out.println("Sorted Array");
        else
            System.out.println("NAAA");
    }
    static int Sorted(int arr[],int i)
    {
        if(i == arr.length - 1)
        {
            return 1;
        }
        if(arr[i] > arr[i+1])
        {
            return 0;
        }
        else
        {
            return Sorted(arr, i+1);
        }
    }
}
