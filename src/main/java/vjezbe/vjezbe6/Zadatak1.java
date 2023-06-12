package vjezbe.vjezbe6;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zadatak1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("nulti");
        arrayList.add("prvi");
        arrayList.add("drugi");
        arrayList.add("treci");
        arrayList.add("cetvrti");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        System.out.println("Array list: " + arrayList);
        System.out.println("Linked list: " + linkedList);

        linkedList.addLast("peti");
        linkedList.addFirst("novi prvi");
        linkedList.addLast("novi zadnji");

        System.out.println("*****Linked list*****");
        for (String elem : linkedList) {
            System.out.println(elem);
        }

        String removedElement = updateElementLinkedList(linkedList, 4, "element iz metode");
        System.out.println("\nAfter method:");
        System.out.println(linkedList);

        System.out.println("Removed element: " + removedElement);

    }

    private static String updateElementLinkedList(LinkedList<String> linkedList, int index, String element) {
        String removedElement = linkedList.get(index);
        linkedList.set(index, element);
        return removedElement;
    }
}
