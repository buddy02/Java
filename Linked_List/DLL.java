package Linked_List;

public class DLL {
    private Node head;
    Node tail;
    private class Node {
        int value;
        Node prev;
        Node next;
        Node(int value) {
            this.value = value;
        }
        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
        
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if(head != null) {
            head.prev = node;
        }
        node.next = head;
        head = node;
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        if(head == null) {
            head = node;
            return;
        }
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        node.prev = last;
        last.next = node;
    }

    public void insert(int val,int index) {
        if(index > size() && index < 0) {
            System.out.println("Index out of bound");
            return;
        }
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size()) {
            insertLast(val);
            return;
        }
        Node temp = get(index-1); 
        Node node = new Node(val,temp,temp.next);
        temp.next = node;
        node.next.prev =  node;
    }

    public void insertAfterVal(int findVal,int val) {
        Node p = find(findVal);
        if(p == null) {
            System.out.println("Node doesn't exist");
            return;
        }
        Node node = new Node(val, p, p.next);
        p.next = node;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }

    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) return node;
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0;i < index;i++) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
