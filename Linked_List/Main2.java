package Linked_List;

public class Main2 {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(99);
        list.insert(39);
        list.insert(23);
        list.insert(65);
        list.display();
        list.delete(99);
        list.display();
        list.delete(23);
        list.display();
        list.delete(65);
        list.display();
    }
}
