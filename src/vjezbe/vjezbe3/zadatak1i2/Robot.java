package vjezbe.vjezbe3.zadatak1i2;

public class Robot {

    private int ID;
    private String name;
    int[][] array2d = new int[5][4];
    int i = 0;
    int j = 0;


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
        System.out.println("Ovaj robot zna hodati.");
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

            return (broj * factJel(broj - 1));
        } else {
            return 1;
        }
    }

    public int[][] fillArr(int broj) {
        array2d[i][j] = broj;
        if (j < array2d[i].length - 1) {
            j++;
        }
        else {
            j = 0;
            if (i < array2d.length - 1) {
                i ++;
            }

        }
        return array2d;
    }


}
