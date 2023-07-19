package Hashing.Hashmap;

import java.util.*;

public class Hasmhy {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pramod" , 20);
        map.put("Kishan" , 21);
        map.put("Dheeraj", 22);
        System.out.println(map.get("Kishan"));
        System.out.println(map);

        if(map.containsKey("Dheerazzz"))
            System.out.println("Dio Boy");
        else 
            System.out.println("find dheerazzz");
        System.out.println(map.get("dheerazzz"));
        map.put("Dheeraj", 2);
        map.put("dheerazz", 8);
        System.out.println(map);
        System.out.println(".........................");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e + " ");
        }
        System.out.println();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + ": " + e.getValue() + " ");
        }
        System.out.println(".........................");
        map.remove("dheerazz");
        map.remove("paparoni");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + map.get(key));
        }

    }
}
