package vjezbe.vjezbe7.zadatak4;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        String fileName = "src\\vjezbe\\vjezbe7\\zadatak4\\randomtext.txt";
        LinkedList<String> linkedList = new LinkedList<>();
        File file = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                linkedList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        printList(linkedList);
        Collections.sort(linkedList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return 1;
                } else if (o1.length() > o2.length()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("\nAfter sorting...");
        printList(linkedList);

    }

    private static void printList(List<String> list) {
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
