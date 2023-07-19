package OOPS.two.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    static long population;

    static void message() {
        System.out.println("Gandhi");
    }

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
        
        // this.message();
        Human.message();
    }
    
    
    public static void main(String[] args) {
        Human pramod = new Human(22, "Pramod", 25000);
        System.out.println(pramod.name);
    }
}
