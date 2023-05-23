package vjezbe.vjezbe7;

import java.util.concurrent.ArrayBlockingQueue;

public class Zadatak3 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> redCekanja = new ArrayBlockingQueue<>(5);

        try {
            redCekanja.add(1);
            redCekanja.add(2);
            redCekanja.add(3);
            redCekanja.add(4);
            redCekanja.add(5);

            System.out.println("Red čekanja: " + redCekanja);

            redCekanja.add(6); // Pokušaj dodavanja šestog elementa
        } catch (IllegalStateException e) {
            System.out.println("Ne možete dodavati više elemenata u red čekanja nego što je definirano.");
        }

        processElement(redCekanja, 1);
        System.out.println("Novi red čekanja: " + redCekanja);

        processElement(redCekanja, 0);
        System.out.println("Novi red čekanja: " + redCekanja);

        addElement(redCekanja, 7);
        System.out.println("Novi red čekanja: " + redCekanja);
    }

    public static boolean processElement(ArrayBlockingQueue<Integer> redCekanja, int flag) {
        Integer element = redCekanja.peek();
        if (element != null) {
            if (flag == 1) {
                System.out.println("Obrada elementa: " + element);
                redCekanja.remove();
                return true;
            } else {
                System.out.println("Element " + element + " je u redu čekanja.");
            }
        } else {
            System.out.println("Red čekanja je prazan.");
        }
        return false;
    }

    public static void addElement(ArrayBlockingQueue<Integer> redCekanja, int element) {
        boolean added = redCekanja.offer(element);
        if (added) {
            System.out.println("Element " + element + " je dodan u red čekanja.");
        } else {
            System.out.println("Red čekanja je pun. Element " + element + " nije dodan.");
        }
    }
}
