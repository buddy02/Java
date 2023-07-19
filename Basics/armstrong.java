public class armstrong {
    public static void main(String[] args) {
        arm();
    }

    static void arm() {
        for (int i = 100; i < 999; i++) {
            int r,c=0,temp=i;
            while (temp > 0) {
                r = temp % 10;
                c = c + r * r * r;
                temp = temp / 10;
            }
            if (c == i)
                System.out.println(c);
        }
    }
    
}
