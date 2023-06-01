package vjezbe.vjezbe8.zadatak2;

import java.util.Scanner;

public class AppClient {

    private static Scanner sc = new Scanner(System.in);
    private static int inputInt;
    private static boolean status = true;

    public static void main(String[] args) {
        while (status) {
            System.out.println("\nPlease enter an integer:");
            try {
                inputInt = sc.nextInt();
                System.out.println("You have entered -> " + inputInt);
                System.out.println("Closing program...");
                status = false;
            } catch (Exception e) {
                System.out.println("Input not correct.\n");
                sc.nextLine(); // clear scanner
                System.out.println("Try again -> Y/n:");
                String continueInput = sc.nextLine();
                if (!continueInput.equals("Y")) {
                    status = false;
                }
            }
        }
    }
}
