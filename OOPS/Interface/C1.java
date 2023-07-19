package OOPS.Interface;

public class C1 implements A1, B1 {
    public void print() {
        System.out.println("hey");
    }
    public static void main(String[] args) {
        C1 c = new C1();
        c.print();
    }
}
interface A1 {
    default void print() {
        System.out.println("heyaaaaa");
    }
}

interface B1 {
    // void print();
    void print();
}
