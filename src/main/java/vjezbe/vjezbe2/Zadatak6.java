package vjezbe.vjezbe2;

import java.util.Arrays;

public class Zadatak6 {

    public static void main(String[] args) {

        int[] niz = new int[15];
        int[] nizCopy = Arrays.copyOf(niz, 15); //kopiramo niz

        System.out.println("Prvi niz:");
        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i] + " ");
        }
        System.out.println("\nDrugi niz: ");
        for (int i = 0; i < nizCopy.length; i++) {
            System.out.print(nizCopy[i] + " ");
        }
        System.out.println();

        //provjeramo jesu li nizovi isti
        System.out.println("\nNizovi su isti: " + Arrays.equals(niz, nizCopy));


    }
}
