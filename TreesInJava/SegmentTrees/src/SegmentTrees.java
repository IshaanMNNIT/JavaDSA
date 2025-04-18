public class SegmentTrees {
    private static class Node {
        int data;
        int startIndex;
        int endIndex;
        Node left, right;

        Node(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }
    }

    Node root;

    public SegmentTrees(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int arr[], int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            Node leaf = new Node(startIndex, endIndex);
            leaf.data = arr[startIndex];
        }

        int mid = (startIndex + endIndex) / 2;
        Node node = new Node(startIndex, endIndex);
        node.left = constructTree(arr, startIndex, mid);
        node.right = constructTree(arr, mid + 1, endIndex);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    public void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "Interval=[" + node.left.startIndex + "-" + node.left.endIndex + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left Child";
        }
        // for current node
        str = str + "Interval=[" + node.startIndex + "-" + node.endIndex + "] and data: " + node.data + " <= ";

        if (node.right != null) {
            str = str + "Interval=[" + node.right.startIndex + "-" + node.right.endIndex + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');
        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi , int qei)
    {
        return this.query(this.root,qsi,qei);

    }

    private int query(Node node, int qsi, int qei) {
        if(node.startIndex >= qsi && node.endIndex <= qei) {
            // node is completely lying inside query
            return node.data;
        } else if (node.startIndex > qei || node.endIndex < qsi) {
            // completely outside
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startIndex&& index <= node.endIndex){
            if(index == node.startIndex && index == node.endIndex) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}



