package predavanja.predavanja15_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestEx {
    private static Scanner scanner;

    public static void main(String[] args) {
     int[] arr = {23, -11, 678, 0, 43, 98};
     String filePath = "src/predavanja/predavanja15_5/dataFile.txt";
     String fileString = readFile(filePath);
        System.out.println(fileString);

    }

    private static String readFile(String filePath) {
        File file = new File(filePath);
        try {
            scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("This file is not found - file name: " + filePath);
        }
        String someString = scanner.findWithinHorizon("Ovo", 4);
        return someString;
    }
}
