import java.util.LinkedList;

class Bucket {
    private LinkedList<Integer> container;

    public Bucket() {
        this.container = new LinkedList<>();
    }

    public void insert(int val) {
        if (!this.container.contains(val)) {
            this.container.addFirst(val);
        }
    }

    public void remove(int val) {
        int index = this.container.indexOf(val);
        if (index != -1) {
            this.container.remove(index);
        }
    }

    public boolean contains(int val) {
        return this.container.contains(val);
    }
}

class MyHashSet {
    private int numBuckets = 769;
    private Bucket[] buckets;

    public MyHashSet() {
        this.buckets = new Bucket[this.numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new Bucket();
        }
    }

    private int getIndex(int key) {
        return key % numBuckets;
    }

    public void add(int key) {
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = this.getIndex(key);
        this.buckets[bucketIndex].remove(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this.getIndex(key);
        return this.buckets[bucketIndex].contains(key);
    }
}
