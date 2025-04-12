import java.util.Iterator;
import java.util.LinkedList;

// Generic Pair class
class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U f, V s) {
        this.first = f;
        this.second = s;
    }
}

// Bucket class
class Buckets {
    private LinkedList<Pair<Integer, Integer>> list;

    public Buckets() {
        list = new LinkedList<>();
    }

    public void put(int key, int val) {
        for (Pair<Integer, Integer> p : list) {
            if (p.first == key) {
                p.second = val;
                return;
            }
        }
        list.addFirst(new Pair<>(key, val));
    }

    public int get(int key) {
        for (Pair<Integer, Integer> p : list) {
            if (p.first == key) {
                return p.second;
            }
        }
        return -1;
    }

    public void remove(int key) {
        Iterator<Pair<Integer, Integer>> it = list.iterator();
        while (it.hasNext()) {
            Pair<Integer, Integer> p = it.next();
            if (p.first == key) {
                it.remove();
                return;
            }
        }
    }
}

// HashMap class
class MyHashMap {
    private Buckets[] buckets;
    private int keyRange = 769;

    public MyHashMap() {
        buckets = new Buckets[keyRange];
        for (int i = 0; i < keyRange; i++) {
            buckets[i] = new Buckets();
        }
    }

    private int getBucketIndex(int key) {
        return key % keyRange;
    }

    public void put(int key, int value) {
        int bucketIndex = getBucketIndex(key);
        buckets[bucketIndex].put(key, value);
    }

    public int get(int key) {
        int bucketIndex = getBucketIndex(key);
        return buckets[bucketIndex].get(key);
    }

    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        buckets[bucketIndex].remove(key);
    }
}
