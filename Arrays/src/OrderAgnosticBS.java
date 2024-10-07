import java.util.*;
public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int a[] = new int[in.nextInt()];
        int i, j;
        for (i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the Target :");
        int target = in.nextInt();
        OrderAgnosticBSearch(a,target);
    }

    static void OrderAgnosticBSearch(int a[], int t) {

        int s = 0, e = a.length - 1;
        int mid;
        int flag = 0;
        boolean isAsc = a[s] < a[e];
        if (isAsc)
        {
            while (s <= e) {
                mid = (s + e) / 2;
                if (t > a[mid]) {
                    s = mid + 1;

                } else if (t < a[mid]) {
                    e = mid - 1;
                } else if (t == a[mid]) {
                    System.out.println("Found It at Index : " + mid);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Cannot be found!!");
        }
        else
        {
            while (s <= e) {
                mid = (s + e) / 2;
                if (t > a[mid]) {
                    e = mid - 1;

                } else if (t < a[mid]) {
                    s = mid + 1;
                } else if (t == a[mid]) {
                    System.out.println("Found It at Index : " + mid);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("Cannot be found!!");
        }
    }
}