package OOPS.Interface;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.brake();
        myCar.acc();
        System.out.println(myCar);
    }
}
