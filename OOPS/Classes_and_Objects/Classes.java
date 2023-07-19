package OOPS.Classes_and_Objects;

public class Classes {
    public static void main(String[] args) {
        // int[] rno = new int[5];
        // String[] names = new String[5];
        Data st1 = new Data(2, "Roy");
        Data st2 = new Data();
        Data kaka = new Data(st1);
        st1.name = "Pramod";
        System.out.println(st1.rno);
        System.out.println(st1.name);
        System.out.println(kaka.name);
        System.out.println(st2.rno);
        System.out.println(st2.name);
        // System.out.println(yoo);
        Data one = new Data();
        Data two = one;
        one.name = "Rangadu";
        two.rno = 333;
        System.out.println(two.name);
        System.out.println(one.rno);
    }

    
}

class Data {
    int rno;
    String name;

    Data(Data bhai) {
        this.rno = bhai.rno;
        this.name = bhai.name;
    }

    Data() {
        this(22, "kai");
    }

    Data(int rnoq, String nameq) {
        this.rno = rnoq;
        this.name = nameq;
    }
}
