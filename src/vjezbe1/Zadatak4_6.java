package vjezbe1;

import java.util.Scanner;

public class Zadatak4_6 {


    public static void main(String[] args) {
        String a = "dobro";
        String b = "bolje";
        String c = "najbolje";

        System.out.println("Kako si danas?");

        Scanner unos = new Scanner(System.in);
        String odgovor = unos.nextLine();

        if (odgovor.equals(a)) {
            System.out.println("Hvala danas sam: dobro.");
        } else if (odgovor.equals(b)) {
            System.out.println("Hvala danas sam: bolje.");
        } else if (odgovor.equals(c)) {
            System.out.println("Hvala danas sam: najbolje.");
        } else {
            System.out.println("Bit će bolje.");
        }
    }
}
