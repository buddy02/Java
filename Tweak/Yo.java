package Tweak;
import java.util.Scanner;

public class Yo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student u1 = new Student();
        Student uu = new Student();
        System.out.println(u1.rno);
        System.out.println(uu.name);
        in.close();
    }
    
}

class Student {
    int rno;
    String name;

    Student() {
        this.rno = 3;
        name = "kaka";
    }
} 