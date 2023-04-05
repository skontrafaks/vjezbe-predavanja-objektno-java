package vjezbe.vjezbe3.zadatak1i2;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Robot {

    private int ID;
    private String name;
    private static final int RWMAX = 5;
    private static final int CLMAX = 4;
    int[][] array2d = new int[RWMAX][CLMAX];
    private int cntFillingArray = 0;
    public boolean flag = true;
    
    UUID uuid = UUID.randomUUID();


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.printf("\nOvaj robot (%s) zna hodati.\n", this.name);
        System.out.println(this.uuid);
    }

    public static int factJel(int broj) {
        /* Riješenje for petljom:
        int faktorijela = broj;
        for(int i = broj - 1; i > 0; i--) {
            faktorijela = faktorijela * i;
        }
        System.out.printf("Faktorijela broja %d je: %d", broj, faktorijela);
        */

        //Riješenje rekurzijom
        if (broj > 0){

            return broj * factJel(broj - 1);
        } else {
            return 1;
        }
    }

    public void fillArr() {
        if (cntFillingArray < RWMAX * CLMAX){
            int rw = cntFillingArray / CLMAX;
            int col = cntFillingArray % CLMAX;
            array2d[rw][col] = ThreadLocalRandom.current().nextInt(10, 100);
            cntFillingArray++;
        } else {
            System.out.println("Array je pun!");
            flag = false;
        }

    }

    public void print2dArray () {
        for (int[] rows : array2d) {
            for (int elem : rows) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }


    public int sumaNBrojeva(int broj){
        int suma = 0;
        for (int i = 0; i < broj + 1; i++){
            suma += i;
        }
        return suma;
    }

    public int potencijaNbroja (int broj, int potencija){
        int result = 1;
        for (int i = 0; i < potencija; i++){
            result = result * broj;
        }
        return result;
    }


}
