package vjezbe.vjezbe2;

import java.util.Scanner;

public class Zadatak1 {

    private static Scanner scanner;

    public static void main(String[] args) {
        String[] strArray = {"Ovo", "je", "array"};
        scanner = new Scanner(System.in);

        System.out.println("Unesite velicinu niza: ");
        int velicinaListe = scanner.nextInt();
        scanner.nextLine();
        String[] arr = userGeneratedStringArray(velicinaListe);

        System.out.printf("%s %s %s \n", strArray[0], strArray[1], strArray[2]);
        for(String i : arr) {
            System.out.println(i);
        }
    }

    private static String[] userGeneratedStringArray(int numElements){
        String[] strArray = new String[numElements];
        for(int i = 0; i < numElements; i++){
            System.out.println("Unesite " + (i + 1) + ". element niza: ");
            strArray[i] = scanner.nextLine();
        }
        System.out.println("----------------------------------");
        return strArray;
    }
}
