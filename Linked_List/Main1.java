package Linked_List;

public class Main1 {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertLast(999);
        list.insertFirst(10);
        list.insertFirst(22);
        list.insertFirst(19);
        list.insertLast(77);
        list.insert(92, 2);
        list.insertAfterVal(999,44);
        list.display();
        System.out.println(list.size());
    }
}
