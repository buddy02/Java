package Stack_Queue;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        this(DEFAULT_SIZE);
    }
    public DynamicQueue(int size) {
        this.data = new int[size];
    }
    @Override
    public void insert(int val) {
        if(isFull()) {
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            end = data.length;
            front = 0;
            data = temp;
        }
        super.insert(val);
    }


}
