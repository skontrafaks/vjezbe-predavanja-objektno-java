package vjezbe1;

import java.util.Scanner;

public class Zadatak2_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj: \t");
        float input = sc.nextFloat();

        float kvadrat = (float) Math.pow(input, 2);
        float kub = (float) Math.pow(input, 3);

        // %.2f is used to round to 2 decimal places
        System.out.printf("Njegov kvadrat je: %.2f | Kub je: %.2f", kvadrat, kub);
    }
}
