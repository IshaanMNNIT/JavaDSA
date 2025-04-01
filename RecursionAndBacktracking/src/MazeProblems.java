import java.util.*;
public class MazeProblems {
    public static void main(String[] args) {
        System.out.println(pathcount(3,3));
        path1("",3,3);
        System.out.println(path2("",3,3));
        System.out.println(DiagonalPaths("",3,3));
    }
    static int pathcount(int r,int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }
        int left = pathcount(r-1,c);
        int right = pathcount(r,c-1);
        return left + right;
    }
    static void path1(String p , int r ,int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r > 1)
        {
            path1(p + 'D',r-1,c);
        }
        if(c > 1)
        {
            path1(p+'R',r,c-1);
        }

    }
    static List<String> path2(String p , int r , int c)
    {
        if(r == 1 && c == 1)
        {
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        List<String> paths = new ArrayList<>();
        if(r > 1)
        {
            paths.addAll(path2(p + 'D',r-1,c));
        }
        if(c > 1)
        {
            paths.addAll(path2(p + 'R',r,c-1));
        }
        return paths;
    }
    static List<String> DiagonalPaths(String p , int r ,int c)
    {
        if(r == 1 && c == 1)
        {
            List<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        List<String> l = new ArrayList<>();
        if(r > 1 && c > 1)
        {
            l.addAll(DiagonalPaths(p + "Diagonal ",r-1,c-1));
        }
        if(r > 1)
        {
            l.addAll(DiagonalPaths(p + "Down ",r-1,c));
        }
        if(c > 1)
        {
            l.addAll(DiagonalPaths(p + "Right ",r,c-1));
        }
        return l;
    }
}
