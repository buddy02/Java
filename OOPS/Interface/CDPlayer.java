package OOPS.Interface;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Playing CD");
    }
    @Override
    public void stop() {
        System.out.println("Pausing CD");
    }  
}
