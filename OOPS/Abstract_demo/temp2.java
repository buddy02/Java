package OOPS.Abstract_demo;

abstract class demo1 {
    abstract void print1(); 
    abstract void print2(); 
    abstract void print3(); 
}

abstract class first extends demo1 {
    void print1() {
        System.out.println("I'm in first class");
    }


}

class second extends first {
    void print2() {
        System.out.println("I'm in second class");
    }
    
    void print3() {
        System.out.println("I'm in second class");
    }

}

public class temp2 {
    public static void main(String[] args) {
        second obj = new second();
        obj.print1();
        obj.print2();
    }
}
