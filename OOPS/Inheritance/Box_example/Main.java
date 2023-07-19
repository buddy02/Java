package Box_example;
public class Main {
    public static void main(String[] args) {
        Box box1 = new BoxWeight();
        System.out.println(box1.l);

        // BoxWeight box2 = new Box();
        BoxWeight box3 = new BoxWeight(2, 4, 6, 8);
        System.out.println(box3.weight);
    }
}
