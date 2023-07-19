package Linked_List;

public class CLL {
    private Node head;
    private Node tail; 

    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value) {
        if(head == null) return;
        Node node = tail;
        do {
            if(node.next.value == value) {
                if(node.next == head) {
                    head = head.next;
                    tail.next = head;
                    return;
                }
                if(node.next == tail) {
                    tail = node;
                    tail.next = head;
                    return;
                }
                node.next = node.next.next;
            }
            node = node.next;
        }while(node !=tail);

    }

    public void display() {
        if(head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while(temp!=head);
        System.out.println("HEAD");
    }

}
