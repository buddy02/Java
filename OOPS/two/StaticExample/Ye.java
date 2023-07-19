package OOPS.two.StaticExample;

public class Ye {
    static long banga;
    int ang;
    String name;

    public Ye(String name, int ang) {
        this.name = name;
        this.ang = ang;
    }

    public Ye(int a) {
        this.ang = a;
        banga += 1;
    }
    

    @Override
    public String toString() {
        return "Ye [ang=" + ang + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        banga += 10;
        Ye yaa = new Ye(10);
        System.out.println(banga);
        System.out.println(yaa);
        Ye ya = new Ye("Salmadu",10);
        System.out.println(ya);
    }
}
