package OOPS.Abstract_demo;

abstract class Base {
    abstract void print();

    final void yoo() {
        System.out.println("Yoo");
    }
    void hey() {
        System.out.println("Hey");
    }

    static void hello() {
        System.out.println("bai ba");
    }
}

class Derived extends Base {
    void print() {
        System.out.println("I'm in the derived class");
    }
    static void hello() {
        System.out.println("bai boy");
    }
}

public class Main {
    public static void main(String[] args) {
        Base obj1 = new Base() {
            @Override
            void print() {
                System.out.println("Hello World");
                
            }
        };
        Derived obj = new Derived();
        Base obj2 = new Derived();
        obj.print();
        obj1.print();
        obj1.hey();
        obj2.hey();
        Derived.hello();
        Base.hello();
        // obj2.hello(); 
        obj2.yoo();
    }
}
