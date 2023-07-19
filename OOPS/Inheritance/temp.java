
class A {
    class B {
        static void print() {
            System.out.println("yeah buddy");
        }
    }
    void hey() {
        System.out.println("hey");
    }
}

class C extends A {
    class D extends A {
        static void print() {
            System.out.println("What's up?");
        }
    }
}

public class temp {
    public static void main(String[] args) {
        C outer = new C();
        C.D inner = outer.new D();
        // inner.print();
        A.B.print();
        inner.hey();
    }
}
