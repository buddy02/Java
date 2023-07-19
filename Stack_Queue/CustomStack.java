package Stack_Queue;

public class CustomStack {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int top = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public void push(int val) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[++top] = val;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length-1;
    }

    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot peek an empty stack");
        }
        return data[top];
    }

    
    
    
}
