package Arrays;

public class BuyStockSell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int p, max_profit = 0;
        // Brute Force -->

//            for(int i = 0 ; i < arr.length ; i++)
//            {
//                for(int j = i + 1 ; j  < arr.length ;j++)
//                {
//                    p = arr[j] - arr[i];
//                    max_profit = Math.max(max_profit,p);
//                }
//            }
//            System.out.println("Max Profit : " + max_profit);
//            return;
        // Optimal
        int mini = arr[0], profit = 0;
        for(int i = 1 ; i < arr.length ; i++)
        {
            p = arr[i] - mini;
            profit = Math.max(profit,p);
            mini = Math.min(mini,arr[i]);
        }
        System.out.println("Max Profit : " + max_profit);
    }
}
