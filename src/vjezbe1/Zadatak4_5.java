package vjezbe1;

import java.util.Scanner;

public class Zadatak4_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi svoju ocjenu iz Osnova programiranja: ");
        int ocjena = scan.nextInt();

        switch (ocjena) {
            case 1:
                System.out.println("Nedovoljan, moras se potruditi");
                break;
            case 2:
                System.out.println("Dovoljan, mozes ti bolje");
                break;
            case 3:
                System.out.println("Dobar, nije lose");
                break;
            case 4:
                System.out.println("Vrlo dobar, lookin good");
                break;
            case 5:
                System.out.println("Odlican, bravo");
                break;
            default:
                System.out.println("Nepostojeca ocjena, dummy");
                break;
        }
    }
}
