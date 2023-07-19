public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.populate();
//        bt.display();
//        BST bst = new BST();
//        bst.insert(3);
//        bst.insert(32);
//        bst.insert(22);
//        bst.insert(14);
//        bst.insert(7);
//        bst.insert(98);
//        bst.insert(31);
//        bst.insert(2);
//        bst.insert(1);
//        int[] arr = {1,2,3,4,5,6,7,8,9};
//        bst.populateSorted(arr);
//        bst.display();
//        bst.postOrder();
        bt.leftView();
    }
}