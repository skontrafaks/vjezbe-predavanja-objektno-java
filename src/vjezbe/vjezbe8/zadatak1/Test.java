package vjezbe.vjezbe8.zadatak1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter file you want to read from: ");
        String filePath1 = "src/vjezbe/vjezbe8/zadatak1/";
        String filePath2 = sc.nextLine();
        String filePath = filePath1 + filePath2;

        try {
            FileHandling.readFileWithScanner(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File non-existent");
        }
        System.out.println("----------------------------------");
        try {
            FileHandling.readFileWithBufferedReader(filePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
