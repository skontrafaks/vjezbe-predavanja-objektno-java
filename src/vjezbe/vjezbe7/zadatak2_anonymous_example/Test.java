package vjezbe.vjezbe7.zadatak2_anonymous_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    private static ArrayList<Integer> listOfNums = new ArrayList<>();

    public static void main(String[] args) {
        addToList(10);
        printList(listOfNums);

        Collections.sort(listOfNums); // ascending order
        printList(listOfNums);

        Collections.sort(listOfNums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        printList(listOfNums);

    }

    private static void addToList(int totalNums) {
        for (int i = 0; i < totalNums; i++) {
            listOfNums.add(0, ThreadLocalRandom.current().nextInt(10, 1000));
        }
    }

    private static void printList(ArrayList<Integer> arrayList) {
        System.out.println("\nPrinting list:");
        for (Integer element : arrayList) {
            System.out.println(element);
        }
    }
}
