package OOPS.Classes_and_Objects;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 3;
        swap(a, b);
        System.out.println(a + " " + b);
        // final int Const = 22;
        // Const = 33;
        // System.out.println(Const);

        // A finch = new A();
        // finch.n = 33;


        // A ram = new A();
        // final A rambai = new A();
        // rambai.name = "rambhai";
        // rambai = ram;

        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj = new A();
        }
        obj = new A();
        obj.name = "kaka";
        System.out.println(obj.name);

    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}

class A {
    final int n = 322;
    String name;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}
