package vjezbe.vjezbe8.zadatak4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private static int ageToGuess;
    private int gameCnt;
    private static Scanner sc = new Scanner(System.in);

    public void gameStart() {
        boolean status = true;
        generateAgeToGuess();

        while (status) {
            gameCnt ++;
            System.out.println("Igra pogadanja pocinje! Trazimo broj izmedu 1 i 100...\n");
            UserInputs userInputs = new UserInputs();

            if (userInputs.getPlayerGuess() == ageToGuess) {
                System.out.println("CESTITAM USPJELI STE!!!");
                System.out.println("Pogodeno iz " + gameCnt + ". pokusaja.");
                status = false;

            } else {
                System.out.println("Promašaj... :(");
                if (ageToGuess > userInputs.getUpperBound()) {
                    System.out.println("Tražena vrijednost je veca od -> " + userInputs.getUpperBound());
                } else if (ageToGuess < userInputs.getLowerBound()) {
                    System.out.println("Tražena vrijednost je manja od -> " + userInputs.getLowerBound());
                } else {
                    System.out.println("Tražena vrijednost je između ->" + userInputs.getLowerBound() + " i " + userInputs.getUpperBound());
                }
                System.out.println("Želite li probati ponovno -> Y za da, ostalo za ne!");
                String continueInput = sc.nextLine();
                if (!continueInput.equals("Y")) {
                    status = false;
                    System.out.println("Izlazimo iz igrice...");
                }

            }
        }

    }

    private static void generateAgeToGuess() {
        ageToGuess = ThreadLocalRandom.current().nextInt(1, 100);
    }


}
