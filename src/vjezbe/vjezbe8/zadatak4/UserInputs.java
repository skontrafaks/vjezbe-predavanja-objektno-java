package vjezbe.vjezbe8.zadatak4;

import java.util.Scanner;

public class UserInputs {

    private int lowerBound;
    private int upperBound;
    private int playerGuess;
    private static Scanner sc = new Scanner(System.in);

    public UserInputs() {
        while (true) {
            try {
                System.out.println("Unesi donju granicu: ");
                this.lowerBound = sc.nextInt();
                sc.nextLine();
                System.out.println("Unesi gornju granicu: ");
                this.upperBound = sc.nextInt();
                sc.nextLine();
                System.out.println("Unesi traženu godinu: ");
                this.playerGuess = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Unos nije tocan probajte ponovno...");
                sc.nextLine();
            }
        }
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getPlayerGuess() {
        return playerGuess;
    }

}
