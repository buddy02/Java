package OOPS.two.StaticExample;

public class OuterClass {
    class InnerClass {
        String name="Pramood";

        void he() {
            System.out.println("Yep");
        }

        // public InnerClass(String name) {
        //     this.name = name;
        // }

    }
    
    public static void main(String[] args) {
        OuterClass a = new OuterClass();
        OuterClass.InnerClass b = a.new InnerClass();
        // InnerClass b = a.new InnerClass();
        System.out.println(b.name);
        // InnerClass baba = new InnerClass("Baba");
    }
}
