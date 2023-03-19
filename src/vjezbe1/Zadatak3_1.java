package vjezbe1;

import java.util.Scanner;

public class Zadatak3_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi cijeli broj: ");

        boolean flag = sc.hasNextInt();
        int broj;

        if(flag) {
            broj = sc.nextInt();
            System.out.println("Uneseni broj je: " + broj);

        }

        else System.out.println("Neispravan unos!");

    }
}
