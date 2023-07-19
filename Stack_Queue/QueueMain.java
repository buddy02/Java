package Stack_Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {   
        // CustomQueue q = new CustomQueue(5);
        // q.insert(55);
        // q.insert(92);
        // q.insert(24);
        // // q.insert(12);
        // // q.insert(67);
        // // q.insert(51);
        // System.out.println(q.delete());
        // System.out.println(q.first());
        // q.display();

        DynamicQueue q = new DynamicQueue(5);
        q.insert(11);
        q.insert(29);
        q.insert(83);
        q.insert(42);
        q.insert(53);
        q.delete();
        q.delete();
        q.delete();
        q.insert(11);
        q.insert(29);
        q.insert(83);
        q.insert(42);
        q.insert(53);
        q.insert(71);
        q.display();
    }
}
