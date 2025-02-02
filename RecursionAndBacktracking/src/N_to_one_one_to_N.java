public class N_to_one_one_to_N {
    public static void main(String[] args) {
        int n = 9;
        print(n);
    }
    static void print(int n)
    {
        if(n==0)return;
        System.out.println(n);
        print(n - 1);
        System.out.println(n);
    }

}
