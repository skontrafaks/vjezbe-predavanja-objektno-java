package vjezbe.vjezbe1;

import java.util.Scanner;

public class Zadatak4_1 {

    public static void main(String[] args) {

        // inputs r and if r is bigger than 10 or smaller than 0 then program terminates

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        double r = input.nextDouble();

        while (r < 10 && r > 0) {
            SphereCalc(r);
            r = input.nextDouble();
        }

        System.out.println("Wrong input, program terminated!");
    }

    public static void SphereCalc(double r) {

        double volume;
        volume = ((float) 4/3)*Math.PI*Math.pow(r, 3);
        System.out.println("Volume is: " + volume);

    }
}
