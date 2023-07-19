package OOPS.two.StaticExample;

public class StaticBlock {
    static int a = 4;
    static int b;
    static {
        System.out.println("yoo");
        b += a+2;
    }
    public static void main(String[] args) {
        System.out.println(a + " " + StaticBlock.b);
    //     // StaticBlock yoo = new StaticBlock();
    //     // System.out.println(StaticBlock.a + " " + StaticBlock.b);
        b *= 2;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
