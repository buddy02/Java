package Stack_Queue;

public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int val) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        size++;
        end = end%data.length;
        data[end++] = val;
    }

    public int delete() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int val = data[front++];
        front = front % data.length;
        size--;
        return val;
    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot peek an empty stack");
        }
        return data[front];
    }

    public boolean isEmpty() {
        return size == 0;     
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void display() {
        for (int i = front; i < front + size; i++) {
            System.out.print(data[i%data.length]+" <- ");
        }
        System.out.println("END");
    }
}
