package vjezbe.vjezbe1;

import java.util.Scanner;

public class Zadatak4_7 {

    public static void main(String[] args) {

        System.out.println("Kako si danas?");
        Scanner unos = new Scanner(System.in);
        String odgovor = unos.nextLine();

        switch (odgovor) {
            case "dobro" -> System.out.println("Hvala danas sam: dobro.");
            case "bolje" -> System.out.println("Hvala danas sam: bolje.");
            case "najbolje" -> System.out.println("Hvala danas sam: najbolje.");
            default -> System.out.println("Bit će bolje.");
        }
    }
}
