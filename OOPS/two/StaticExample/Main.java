package OOPS.two.StaticExample;

public class Main {
    public static void main(String[] args) {
        // Human pramod = new Human(22, "Pramod", 25000);
        // Human kaka = new Human(12, "kaka", 20000);
        // System.out.println(pramod.population);        
        // System.out.println(kaka.population);  
        
        // Main use = new Main();
        // use.greeting();     
        greeting();
        Main use = new Main();
        use.he();
    }

    void he() {
        him();
        greeting();
    }

    void him() {
        System.out.println("Hey");
    }

    static void greeting() {
        System.out.println("Jackgo");
    }
}