package vjezbe.vjezbe1;

import java.util.Scanner;

public class Zadatak4_2 {

    public static void main(String[] args) {

        // inputs n and if n is not integer or positive number it again asks for input

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Unesite prirodan broj dozvoljene velicine za tip int: ");
            String inputStr = input.nextLine();

            try {
                int n = Integer.parseInt(inputStr);
                if (n > 0) {
                    SumN(n);
                    break;
                }
            } catch (NumberFormatException ignored) {}

            System.out.println("Nedozvoljen unos, probajte ponovo");
        }

    }
    public static void SumN(int n){
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }

        System.out.printf("Suma prvih %d prirodnih brojeva je: %d%n", n, sum);
    }
}
