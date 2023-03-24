package vjezbe.vjezbe2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak7 {

    public static void main(String[] args) {

        int[][] arr2D = new int[3][4];
        int max = 0;

        System.out.println("Generating 2D array...");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D.length; j++) {
                arr2D[i][j] = ThreadLocalRandom.current().nextInt(10, 100);
                if (arr2D[i][j] >= max) max = arr2D[i][j];
            }
        }
        System.out.println("Finished! \n" + Arrays.deepToString(arr2D));
        System.out.println("Max value is: " + max);



    }
}
