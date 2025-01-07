import java.util.*;
public class BS4FirstAndLast {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int arr[]={1,1,2,3,3,3,4,4,4,5,5,5}; //length  = 12
        System.out.println("Enter the target : ");
        int target = in.nextInt();
        System.out.println("["+first(arr,target)+","+last(arr,target)+"]");
    }
    static int first(int arr[],int target)
    {
        int s=0;
        int e=arr.length-1; // e=11
        int mid;
        int index=-1; // arr[5] = 3 ? First Occurrence at index 5 NO!
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
                         //e=4 and s=0
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
        } return index;
    }

     static int last(int arr[],int target)
     {
         int s=0;
         int e=arr.length-1;// e = 11
         int mid;int index=-1;
         while(s<=e)
         { // target = 4
             mid = (s+e)/2; //(i> mid = 5 and arr[5] = 3)
             if(arr[mid]==target)
             {
                 if(mid!=arr.length-1) {
                     if (arr[mid + 1] == arr[mid])
                     {
                         s = mid + 1;

                     } else {
                         index = mid;
                         break;
                     }
                 }
                 else{
                     index = arr.length - 1;break;
                 }
             }
             else if(arr[mid]>target)
             {
                 e=mid-1;
             }
             else {
                 s = mid + 1;
             }
         }return index;
     }
}
