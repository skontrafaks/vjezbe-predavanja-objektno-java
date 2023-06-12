package predavanja.predavanja15_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestInput {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter some number that can be considered as double: ");
            double doubleNumber = 0;
            try {
                doubleNumber = scanner.nextDouble();
                System.out.println("You have entered: " + doubleNumber);
            } catch (InputMismatchException e) {
                System.out.println("Wrong input...");
                System.out.println("Removing from scanner - " + scanner.next());
            } finally {
                System.out.println("Enter y for continue and n for exit.");
                String cont = scanner.next();
                if (cont.equalsIgnoreCase("y")) {
                    System.out.println("You choose new input of double value...");
                } else {
                    System.out.println("Exit from input prompting...");
                    break;
                }
            }
        }
    }
}
