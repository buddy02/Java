package OOPS.two.Singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton a = new Singleton(); 
        Singleton a = Singleton.yoo();
        System.out.println(a.name);
        Singleton b = Singleton.yoo();
        System.out.println(b.name);
        b.name = "Gandhi";
        System.out.println(a.name);
        // int k = Singleton.n;
        // System.out.println(k);
    }
}
