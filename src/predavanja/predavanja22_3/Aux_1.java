package predavanja.predavanja22_3; // generira 2d array sa nulama

import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.*;

public class Aux_1 {

    public static int[][] gen2DInt (int rows, int colums) throws InterruptedException {

        System.out.println("Making a 2d array with random numbers...");
        sleep(1000);

        final int MAX = 100;
        final int MIN = 10;

        int[][] intArray2d = new int[rows][colums]; // generira 2d array sa nulama

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < colums; j++) {
                intArray2d[i][j] = ThreadLocalRandom.current().nextInt(MIN, MAX);
            }
        }
        System.out.println("Finished making a 2d array with random numbers");
        return intArray2d;
    }
}
