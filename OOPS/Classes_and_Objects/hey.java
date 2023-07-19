package OOPS.Classes_and_Objects;
public class hey {
    public static void main(String[] args) {
        // Human pra = new Human(3);
        // Human pr = new Human(3);
        System.out.println(Human.po1);
        System.out.println(Human.po1);
    }
}
class Human {
    int po;
    static int po1;
    public Human(int po) {
        this.po = po;
        Human.po1 += 1; 
    }
}
