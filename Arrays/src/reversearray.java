public class reversearray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        for(int i : a)
            System.out.print(i+" ");
        System.out.println();
        for(int j=a.length-1;j>=0;j--)
        {
            System.out.print(a[j]+" ");
        }

    }
}
