package Linked_List;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertLast(99);
        list.insert(67,2);
        list.insertRec(107,4);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        LL list1 = new LL();
        for (int i = 1; i < 3; i++) {
            list1.insertFirst(i);
        }
        list1.display();
        list1.reverse();
        list1.display();
        System.out.println(list.size());

    }
}
