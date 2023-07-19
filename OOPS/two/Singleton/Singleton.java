package OOPS.two.Singleton;

public class Singleton {
    // private static int n = 4;
    String name;
    private Singleton() {
        this.name = "Param";
        // System.out.println(name);
    }

    static Singleton a;

    public static Singleton yoo() {
        if (a == null) {
            a = new Singleton();
        }
        return a;
    }
    
}
