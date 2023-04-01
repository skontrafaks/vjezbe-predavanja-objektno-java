package vjezbe.vjezbe3.zadatak1i2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Robot robi = new Robot();
        robi.setID(420);
        robi.setName("Robi");
        robi.walk();
        System.out.println("Rezultat rekurzije unesenog broja je: " + robi.factJel(5));


        //Drugi zadatak
        Scanner scanner = new Scanner(System.in);
        int brojUnosa = 0;

        do {
            System.out.printf("Unesi %d. element liste:\n",brojUnosa );
            int unos = scanner.nextInt();
            robi.fillArr(unos);
            scanner.nextLine();
            brojUnosa++;
        } while (brojUnosa <= 20);

        System.out.println(Arrays.deepToString(robi.array2d));

    }
}
