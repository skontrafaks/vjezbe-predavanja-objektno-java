package vjezbe.vjezbe2;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
public class Zadatak8 {

    public static void main(String[] args) {

        Integer[] arr = new Integer[15];

        // Popunjavamo niz
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(10, 100);
        }
        System.out.println("Naš niz: " + Arrays.toString(arr));

        System.out.println("Sortiram silazno...");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("GOTOVO! \n" + Arrays.toString(arr));


    }
}
