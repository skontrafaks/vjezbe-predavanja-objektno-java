package predavanja.predavanja22_3;

import static java.lang.Thread.*;

public class TestAux {

    public static void main(String[] args) throws InterruptedException {
        int[][] gen2DInt = Aux_1.gen2DInt(3, 4);
        sleep(500);
        print2DArray(gen2DInt);

    }

    public static void print2DArray(int[][] array) throws InterruptedException {
        System.out.println("Printing 2d array: ");
        sleep(1000);
        for (int i = 0; i < array.length; i++) { //lenght redova
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" |" + array[i][j] + "| ");
            }
            System.out.println();
        }
    }
}
