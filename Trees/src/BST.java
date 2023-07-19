import java.util.Scanner;

public class BST {
    Node root;
    Scanner in = new Scanner(System.in);
    private static class Node {
        int value;
        Node left;
        Node right;
        int height;

        Node(int value) {
            this.value = value;
        }
    }

    public int height(Node node) {
        if(node == null) return -1;
        else return node.height;
    }

    public boolean inEmpty() {
        return root==null;
    }

    public void insert(int val) {
        root = insert(root,val);
    }

//    private void insert(Node node, int val) {
//        if(node.value > val) {
//            if(node.left == null) node.left = new Node(val);
//            else insert(node.left,val);
//        }
//        else {
//            if(node.right == null) node.right = new Node(val);
//            else insert(node.right,val);
//        }
//    }
    private Node insert(Node node, int val) {
        if(node == null) {
            return new Node(val);
        }
        if(node.value > val) {
            node.left = insert(node.left,val);
        }
        else {
            node.right = insert(node.right,val);
        }
        node.height = Math.max(height(node.right),height(node.left))+1;
        return node;
    }
    public void populateSorted(int[] arr) {
        populateSorted(arr,0, arr.length);
    }
    private void populateSorted(int[] arr, int l, int h) {
//        if(l==h) insert(arr[l]);
        if(l>=h) return;
        int m = (l+h)/2;
        insert(arr[m]);
        populateSorted(arr,l,m);
        populateSorted(arr,m+1,h);
    }
    public boolean isBalanced() {
        if(root == null) return true;
        return Math.abs(height(root.right)-height(root.left))<=1;
    }

    public void display() {
        display(root,"Root Node: ");
    }
//    private void display(Node node) {
//        if(node==null) return;
//        System.out.print(node.value + " ");
//        display(node.left);
//        display(node.right);
//    }

    private void prettyDisplay(Node node, String indent) {
        if(node==null) return;
        prettyDisplay(node.right,indent+"   ");
        System.out.println(indent + node.value);
        prettyDisplay(node.left,indent+"   ");
    }
    private void display(Node node, String pr) {
        if(node==null) return;
        System.out.println(pr + node.value); // can also add height by (+ " height : " + node.height)
        display(node.left,"Left child of " + node.value + " : ");
        display(node.right,"Right child of " + node.value + " : ");
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

    public int depth(int val) {
        return depth(root, val,0);
    }

    private int depth(Node node, int val, int depth) {
        if(node == null) return -1;
        if(node.value == val) return depth;
        if(node.value < val) return depth(node.right, val, depth+1);
        return depth(node.left,val,depth+1);
    }

    public int myHeight(int val) {
        return height(find(val));
    }
    public Node find(int val) {
        return find(root,val);
    }
    private Node find(Node node,int val) {
        if(node == null) return null;
        if(node.value == val) return node;
        if(node.value < val) return find(node.right,val);
        return find(node.left,val);
    }


}
