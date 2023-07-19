package Linked_List;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        size = 0;
    }
    public int size(){
        return size;
    }
    private class Node{
        private int value;
        private Node next;
        Node(int value) {
            this.value = value;
        }
        Node(int value,Node nextNode) {
            this.value = value;
            this.next = nextNode;
        }
    }
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null) tail = head;
        size++;
    }
    public void insertLast(int value) {
        if(tail==null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val,int index) {
        if(index > size || index < 0) {
            System.out.println("Error");
            return;
        }
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = get(index-1);
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void insertRec(int value,int index) {
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value,int index,Node node) {
        if(index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    public int deleteFirst() {
        if(size == 0) {
            System.out.println("Error");
            return 0;
        }
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if(index == 0) return deleteFirst();
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
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
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    public void bubbleSort() {
        bubbleSort(size-1,0);
    }
    public void bubbleSort(int row,int col) {
        if(row == 0) return;
        if(col<row) {
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value) {
                if(first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail) {
                    Node prevNode = get(col-1);
                    prevNode.next = second;
                    tail = first;
                    first.next = null;
                    second.next = first;
                }
                else {
                    Node prevNode = get(col-1);
                    prevNode.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }
        else {
            bubbleSort(row-1, 0);
        }
    }

    public void reverse() {
        // tail = rev(head);
        // tail.next = null;
        reverse(head);
    }
    public Node rev(Node node) {
        if(node == tail) {
            head = tail;
            return head;
        }
        Node prev = rev(node.next);
        prev.next = node;
        return node;
    }
    public void reverse(Node node) {
        tail = node;
        Node prev = null;
        Node pres = node;
        node = node.next;
        while(node!=null) {
            pres.next = prev;
            prev = pres; 
            pres = node;
            node = node.next;
        }
        pres.next = prev;
        head = pres;
    }
    
}

