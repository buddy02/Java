package Stack_Queue;

public class DynamicStack extends CustomStack{
    DynamicStack() {
        super();
    }
    DynamicStack(int size) {
        super(size);
    }
    @Override
    public void push(int val) {
        if(isEmpty()) {
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        super.push(val);
    }

    
}
