package Linked_List;

public class BubbleSort {
    public static void main(String[] args) {   
        LL list = new LL();
        for(int i=1;i<7;i++) {
            list.insertFirst(i);
        }
        list.display();
        list.bubbleSort();
        list.display();
    }

}
