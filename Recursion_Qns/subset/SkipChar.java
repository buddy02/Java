package Recursion_Qns.subset;

public class SkipChar {
    public static void main(String[] args) {
        String s = "ksafafd";
        String s1 = "";
        System.out.println(skipstr("fdfhappfappleds"));
        System.out.println(skip2(s));
        System.out.println(skip(s, s1));
    }

    private static String skip(String up, String p) {
        if (up.isEmpty())
            return p;
        if (up.charAt(0) != 'a')
            p += up.charAt(0);
        return skip(up.substring(1), p);
    }

    private static String skip2(String s) {
        if (s.isEmpty())
            return s;
        if (s.charAt(0) != 'a') {
            return s.charAt(0) + skip2(s.substring(1));
        }
        return skip2(s.substring(1));
    }
    // private static String skip1(String s, int i) {
    //     if (i == s.length())
    //         return "";
    //     if (s.charAt(i) != 'a') {
    //         return s.charAt(i) + skip1(s, i + 1);
    //     }
    //     return skip1(s, i + 1);
    // }

    private static String skipstr(String up) {
        if (up.length()<5)
            return up;
        if (!up.startsWith("apple") && up.startsWith("app")) {
            return skipstr(up.substring(3));
        }
        return up.charAt(0) + skipstr(up.substring(1));
    }

}
