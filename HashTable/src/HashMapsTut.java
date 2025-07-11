import java.util.HashMap;
import java.util.HashSet;

public class HashMapsTut {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Kunal",89);
        map.put("Karan",99);
        map.put("Rahul",94);
        System.out.println(map.get("Kunal"));
        System.out.println(map.getOrDefault("Apporv",77));
        System.out.println(map.containsKey("Kunal"));
        System.out.println(map.containsValue(89));

        HashSet<Integer> s = new HashSet<>();
        s.add(99);
        s.add(9);
        s.add(9);
        s.add(43);
        s.add(56);
        s.add(43);
        System.out.println(s);

    }
}
