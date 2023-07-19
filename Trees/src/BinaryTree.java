import java.util.Scanner;

public class BinaryTree {
    Node root;
    Scanner in = new Scanner(System.in);
    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
    public void populate() {
        System.out.println("Enter the value of root node: ");
        int value = in.nextInt();
        root = new Node(value);
        populate(root);
    }

    private void populate(Node node) {
        System.out.println("Do you want to add a new value to left of " + node.value);
        boolean left = in.nextBoolean();
        if(left) {
            System.out.println("Enter the value you want to add to the left of " + node.value);
            int value = in.nextInt();
            node.left = new Node(value);
            populate(node.left);
        }
        System.out.println("Do you want to add a new value to right of " + node.value);
        boolean right = in.nextBoolean();
        if(right) {
            System.out.println("Enter the value you want to add to the right of " + node.value);
            int value = in.nextInt();
            node.right = new Node(value);
            populate(node.right);
        }
    }

    public void display() {
        prettyDisplay(root,"");
    }
    private void display(Node node) {
        if(node==null) return;
        display(node.left);
        display(node.right);
        System.out.println(node.value);
    }

    private void prettyDisplay(Node node,String indent) {
        if(node==null) return;
        prettyDisplay(node.right,indent+"     ");
        if(node!=root) System.out.println(indent + "|---" + node.value);
        else System.out.println("     " + node.value);
        prettyDisplay(node.left,indent+"     ");
    }

    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if(node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node) {
        if(node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public int size() {
        return size(root);
    }
    private int size(Node node) {
        if(node==null) return 0;
        return size(node.left) + size(node.left) + 1;
    }

    public int height(Node node) {
        if(node == null) return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
