package vjezbe.vjezbe2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {

    private static Scanner scanner;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        System.out.println("Unesite broj mjerenja: ");
        int brojMjerenja = scanner.nextInt();
        scanner.nextLine();

        double[] mjerenja = userGenerateddoubleArray(brojMjerenja);
        double prosjek = Arrays.stream(mjerenja).average().getAsDouble();

        int ispodProsjeka = 0;
        int iznadProsjeka = 0;
        int jednakoProsjeku = 0;

        for(double i : mjerenja) {
            if(i < prosjek) {
                ispodProsjeka++;
            } else if(i > prosjek) {
                iznadProsjeka++;
            } else {
                jednakoProsjeku++;
            }
        }
        System.out.printf("Prosjek temperature je: %.2f °C\n", prosjek);
        System.out.printf("Broj mjerenja ispod prosjeka: %d\n", ispodProsjeka);
        System.out.printf("Broj mjerenja iznad prosjeka: %d\n", iznadProsjeka);
        System.out.printf("Broj mjerenja jednako prosjeku: %d\n", jednakoProsjeku);

    }

    private static double[] userGenerateddoubleArray(int numElements){
        double[] fltArray = new double[numElements];
        for(int i = 0; i < numElements; i++){
            System.out.println("Unesite " + (i + 1) + ". mjerenje: ");
            fltArray[i] = scanner.nextDouble();
        }
        System.out.println("----------------------------------");
        return fltArray;
    }
}
