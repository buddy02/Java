package OOPS.two.StaticExample;


public class StaticNestedClass {
    static class InnerClass {
        String name;

        public InnerClass(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
        

    }

    public static void main(String[] args) {
        // StaticNestedClass.InnerClass pramod = new InnerClass("Pramod");
        InnerClass pramod = new InnerClass("Pramod");
        System.out.println(pramod);    
    }
}
