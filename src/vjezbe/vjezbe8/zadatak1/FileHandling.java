package vjezbe.vjezbe8.zadatak1;

import java.io.*;
import java.util.Scanner;

public class FileHandling {

    public static void readFileWithScanner(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }

    public static void readFileWithBufferedReader(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
