package Box_example;


public class BoxWeight extends Box {
    double weight = 22.22;


    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l);
        BoxWeight box2 = new BoxWeight(11,11,11,11);
        System.out.println(box2.weight);
    }
    

    BoxWeight() {
        this.l = 2.0;
    }

    BoxWeight(double weight, double l, double h, double w) {
        super(l, h, w);
        // this.weight = weight;
    }
}
