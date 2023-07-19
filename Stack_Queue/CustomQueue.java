package Stack_Queue;

public class CustomQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int val) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        data[end++] = val;
    }

    public int delete() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int val = data[0];
        for(int i=1;i<end;i++) {
            data[i-1] = data[i];
        }
        end--;
        return val;
    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cannot peek an empty stack");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length;
    }

}
