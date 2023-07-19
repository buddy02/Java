public class String_example {
    public static void main(String[] args) {
        // String s1 = "babji";
        // String s2 = "babji";
        // s1 = s1 + "";
        // if (s1.equals(s2))
        // System.out.println("Yeah");
        // else
        // System.out.println("nope");
        String_example s3 = new String_example(2);
        String_example s4 = new String_example(2);
        if (s3.equals(s4))
            System.out.println("Yeah");
        else
            System.out.println("nope");

    }

    int a;

    public String_example(int a) {
        this.a = a;
    }

}
