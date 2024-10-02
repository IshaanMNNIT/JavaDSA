public class Bubble {
    public static void main(String[] args) {
        int arr[]={1,5,7,5,3,5,7,8,9,0,2};
        int i,j,temp;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
