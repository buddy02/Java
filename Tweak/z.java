package Tweak;

public class z implements y {

    @Override
    public void print() {
        System.out.println("hello");
    }

    public void hey() {
        System.out.println("hryython");
    }

    public static void main(String[] args) {
        y ob = new z();
        ob.print();
    }    
}
