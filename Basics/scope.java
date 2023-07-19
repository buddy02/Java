public class scope {
    public static void main(String[] args) {
        int a = 0;
        //Block Scope
        {
            a = 20;
            int b = 1;
            System.out.println(b);
        }
        //loop Scope
        for (int i = 0; i < 5; i++) {
            // int x = 2;
        }
        // System.out.println(i);
        // System.out.println(x);
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        // z = 1; method Scope
    }

    static void hei() {
        // a = 1; method Scope
        int z = 19;
        System.out.println(z);
    }
}
