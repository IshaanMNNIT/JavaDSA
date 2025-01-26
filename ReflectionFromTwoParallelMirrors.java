import java.util.*;
public class ReflectionFromTwoParallelMirrors {
    public void reflection(Scanner in) {
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>(10);
        int i,j;
        for(i = 0,j = 0 ; i < (k) ; i++ , j++)
        {
            a1.add(x + j * d1);
            a1.add((d1 - x) + j * d1);
            a1.add(y + j*d2);
            a1.add((d2-y)+j*d2);
        }
        Collections.sort(a1);
        System.out.println(a1.get(k - 1));
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        ReflectionFromTwoParallelMirrors obj = new ReflectionFromTwoParallelMirrors();
        int n = in.nextInt();
        for(int i = 0; i<n; i++)
        {
            obj.reflection(in);
        }
    }
}