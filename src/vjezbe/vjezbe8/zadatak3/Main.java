package vjezbe.vjezbe8.zadatak3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static int[] arrayOfInts = new int[10];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Lenght of array is -> " + arrayOfInts.length);
        System.out.println("With how many ints you want to fill list?");
        try {
            int numberOfInts = sc.nextInt();
            fillArrayWithInts(numberOfInts);
        } catch (Exception e) {
            System.out.println(e.toString() + " IN: " + e.getStackTrace()[e.getStackTrace().length - 1]);
        } finally {
            System.out.println("List now: " + Arrays.toString(arrayOfInts));
        }
        System.out.println("\nFINISHED");
    }

    private static void fillArrayWithInts(int numberOfInts) throws IndexOutOfBoundsException {
        for (int i = 0; i < numberOfInts; i++) {
            arrayOfInts[i] = ThreadLocalRandom.current().nextInt(5, 32);
        }
    }
}
