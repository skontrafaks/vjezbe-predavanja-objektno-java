package vjezbe.vjezbe1;

import java.util.Scanner;

public class Zadatak4_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userInput;
        char userChoice;

        do {
            System.out.print("Unesite neki string: ");
            userInput = input.nextLine();
            System.out.println("Unijeli ste: " + userInput);

            System.out.print("Želite li ponoviti unos?\n(unesi y za da, bilo koji drugi znak za ne):\n ");
            userChoice = input.next().charAt(0); // uzimamo prvi karakter iz stringa
            input.nextLine();

        } while (userChoice == 'y' || userChoice == 'Y');

        System.out.println("Izabrali ste izlaz iz programa!");
    }
}