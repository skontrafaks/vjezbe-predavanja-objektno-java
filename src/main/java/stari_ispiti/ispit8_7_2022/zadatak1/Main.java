package stari_ispiti.ispit8_7_2022.zadatak1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter file path:");
            String filePath = sc.nextLine();
            try {
                AUXCLS.readDataFromCSV(filePath);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File not found!, Try again!");
            }
        }
        AUXCLS.printStudents();
    }
}
