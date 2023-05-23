package vjezbe.vjezbe6.zadatak5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add("auto");
        vehicles.add("svemirski brod");
        vehicles.add("avion");
        vehicles.add("helikopter");
        vehicles.add("jedrilica");
        vehicles.add("gliser");
        vehicles.add("romobil");
        vehicles.add("bicikla");

        printList(vehicles);
        Collections.sort(vehicles); // po abecedi
        printList(vehicles);
        Collections.sort(vehicles, new LenghtStrComparator());
        printList(vehicles);


    }

    private static void printList(ArrayList<String> arrayList) {
        System.out.println("\nPrinting list:" + arrayList);
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
