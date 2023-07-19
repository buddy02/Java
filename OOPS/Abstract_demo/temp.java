package OOPS.Abstract_demo;

abstract class A {
    abstract class B {
        static void print() {
            System.out.println("yeah buddy");
        }

        void hey() {
            System.out.println("hey");
        }
    }
}

class C extends A {
    class D extends B {
        static void print() {
            System.out.println("What's up?");
        }

        // void hey() {
        //     System.out.println("heyyyy");
        // }
    }
}

public class temp {
    public static void main(String[] args) {
        C outer = new C();
        C.D inner = outer.new D();
        // inner.print();
        inner.hey();
    }
}
