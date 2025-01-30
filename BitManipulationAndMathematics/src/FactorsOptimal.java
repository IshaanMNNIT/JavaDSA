import java.util.ArrayList;

public class FactorsOptimal {
    public static void main(String[] args) {
        int n = 20;
        factors(n);
    }
    static void factors(int n) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0)
            {
                if(n / i == i)
                System.out.print(i + " ");
                else
                {
                    System.out.print(i + " ");
                    l.add(n/i);
                }
            }

        }
        for(int i = l.size() - 1 ; i >= 0 ; i--)
        {
            System.out.print(l.get(i) + " ");
        }
    }
}
