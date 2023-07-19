package OOPS.Interface;

public class Car implements Engine, Brake {

    @Override
    public void start() {
        System.out.println("Car is running");
    }
    
    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }
    @Override
    public void brake() {
        System.out.println("Car is braking");
    }

    @Override
    public void acc() {
        System.out.println("Car is accelerating");
    }

}
