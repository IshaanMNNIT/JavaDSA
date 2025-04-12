import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
        {
            if(map.containsKey(n) == false)
            {
                map.put(n,0);
            }
            map.put(n, map.get(n) + 1);
        }
        for(int n : nums){
            if(map.get(n) == 1)return n;
        }
        return -1;
    }
    }

