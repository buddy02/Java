package Stack_Queue;

public class StackMain {
    public static void main(String[] args) throws Exception {   
        CustomStack st = new DynamicStack(5);
        // System.out.println(st.peek());
        st.push(32);
        st.push(84);
        st.push(29);
        st.push(33);
        st.push(21);
        st.push(24);
        System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.peek());
        // System.out.println(st.pop());


    }
}
