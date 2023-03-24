package vjezbe.vjezbe2;

import predavanja.predavanja22_3.Aux_1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak4 {

    private final static int MAX = 10;
    private final static int MIN = 1;

    public static void main(String[] args) {

        int[][] arr = new int[4][4];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ThreadLocalRandom.current().nextInt(MIN, MAX);
            }
        }

        System.out.println(Arrays.deepToString(arr));
        /* Nedostatak ovog nacina ispisa je sto je nas array ispisan u jednom redu,
        a ne kao matrica. */
    }
}
