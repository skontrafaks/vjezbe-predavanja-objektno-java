package vjezbe.vjezbe7.zadatak5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("car");
        linkedList.add("helicopter");
        linkedList.add("electronic bike");
        linkedList.add("truck");
        linkedList.add("motorcycle");
        linkedList.add("carriage");

        printList(linkedList);
        System.out.println("----------------------------");
        printWithIterator(linkedList);
        System.out.println("-----------------------------");
        printWithIterator(linkedList);

        ListProcessing.insertVeh(linkedList, "Stagecoach");
        System.out.println("++++++++++++++++++++++++++");
        printWithIterator(linkedList);

    }

    private static <E> void printList(List<E> list) {
        for (E elem : list) {
            System.out.println(elem);
        }
    }

    private static <E> void printWithIterator(List<E> list) {
        Iterator<E> iterator = list.iterator();

        while(iterator.hasNext()) {
            E element = iterator.next();
            System.out.println(element);
            if (element.equals("carriage")) {
                list.remove(element);
            }
        }
    }
}
