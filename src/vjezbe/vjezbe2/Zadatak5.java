package vjezbe.vjezbe2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zadatak5 {

    private final static int MAX = 10000;
    private final static int MIN = 1000;
    public static void main(String[] args) {

        int[][] arrayFinancija = new int[12][3];
        int mjesec = 1;


        for (int i = 0; i < arrayFinancija.length; i++) {
            for (int j = 0; j < arrayFinancija[i].length; j++) {
                if (j == 0) {
                    arrayFinancija[i][j] = mjesec;
                    mjesec++;
                } else {
                    arrayFinancija[i][j] = ThreadLocalRandom.current().nextInt(MIN, MAX);
                }
            }
        }

        for (int i = 0; i < arrayFinancija.length; i++) {
            for (int j = 0; j < arrayFinancija[i].length; j++) {
                System.out.print(" |" + arrayFinancija[i][j] + "| ");
            }
            System.out.println();
        }

        int[] profit = new int[12];

        for (int i = 0; i < arrayFinancija.length; i++) {
            profit[i] = arrayFinancija[i][1] - arrayFinancija[i][2];
        }

        for (int i = 0; i < profit.length; i++) {
            System.out.println("Profit za " + arrayFinancija[i][0] + ". mjesec je: " + profit[i]);
        }

        double yearAverage = Arrays.stream(profit).average().getAsDouble();
        System.out.printf("Prosječan profit ove godine je: %.3f", yearAverage);
    }
}
