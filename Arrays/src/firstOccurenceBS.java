import java.util.*;
public class firstOccurenceBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1,1,2,3,3,3,4,4,4,5,5,5};// Length = 12
                // 0 1 2 3 4 5 6 7 8 9 10 11
        int target = in.nextInt(); // Let target =3
        
        int s=0;
        int e=arr.length-1; // e=11
        int mid;int index=-1; // arr[5] = 3 ? First Occurrence at index 5 NO!
        while(s<=e)
        { //target = 3
            mid = (s+e)/2;//(i>mid = 5 and arr[5]=3) (ii>mid = 2 and arr[2]=2 and target>arr[mid])
            //(iii>mid = 3 and arr[3] = 3)
            if(arr[mid]==target)
            {
                if(mid!=0) {
                    if (arr[mid - 1] == arr[mid]) //arr[mid-1 = 4]=3
                    {
                        e = mid - 1;
                        continue; //e=4 and s=0
                    } else {
                        index = mid;
                        break; // Index = 3
                    }
                }
                else{
                    index = 0;break;
                }
            }
            else if(arr[mid]>target)
            {
                e=mid-1;
            }
            else {
                s = mid + 1; //s=3 e=4
            }
        }
        if(index!=-1)
            System.out.println("First Occurence = "+index); //3 must be the output
        else
            System.out.println("Not Found ");
    }
}
