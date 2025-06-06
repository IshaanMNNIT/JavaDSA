import java.util.*;
public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node{
        int val;
        Node left;
        Node right;
        public Node(int value){
            this.val = value;
        }
    }

    private Node root;

    // INSERT elements
    // Populating the tree

    public void populate(Scanner in){
        System.out.println("Enter the root node : ");
        int value = in.nextInt();
        root = new Node(value);
        populate(in,root);
    }
    public void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter left of " + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }

    }

    public void display(){
        display(this.root , "");
    }
    public void display(Node node , String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");

    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        preOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        System.out.print(node.val + " ");
        preOrder(node.right);
    }

    public void postOrder() {
        preOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        System.out.print(node.val + " ");
    }

}
