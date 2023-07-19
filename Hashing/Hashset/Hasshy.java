package Hashing.Hashset;
// import java.util.Iterator;
import java.util.HashSet;

public class Hasshy {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            set.add(i);
        }
        System.out.println(set);
        set.add(2);
        System.out.println(set.size());
        set.remove(2);
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.contains(6));
        // Iterator j1 = set.iterator();
        // for (int i = 0; i < set.size(); i++)
        //     System.out.println(j1.next());
        // // System.out.println(j1.next());
        // set.add(2);
        // Iterator j = set.iterator();
        // for (int i = 0; i < set.size() - 2; i++)
        //     System.out.println(j.next());
        // // System.out.println(j.next());
        // while(j.hasNext()) System.out.println(j.next());

    }
}
