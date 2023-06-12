package vjezbe.vjezbe6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Zadatak2 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(159, "Divna");
        linkedHashMap.put(985, "Etna");
        linkedHashMap.put(21, "Stipe");
        linkedHashMap.put(455, "Petar");
        linkedHashMap.put(5788, "Vlatka");

        TreeMap<Integer, String> treeMap = new TreeMap<>(linkedHashMap);

        for (Integer key : linkedHashMap.keySet()) {
            System.out.println("id= " + key + " | Name= " + linkedHashMap.get(key));
        }

        System.out.println("-----Tree set-----");

        for (Integer key : treeMap.keySet()) {
            System.out.println("id= " + key + " | Name= " + linkedHashMap.get(key));
        }

        // uocavamo da treeMap sortira po kljucevima


    }
}
