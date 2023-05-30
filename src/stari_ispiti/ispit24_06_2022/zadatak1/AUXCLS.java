package stari_ispiti.ispit24_06_2022.zadatak1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AUXCLS {

    private static HashMap<String, String[]> hashMap = new HashMap<>();
    private static Scanner sc;
    private static int studentCounter = 1;

    public static void readDataFromCSVFile(String filePath) throws FileNotFoundException {
        System.out.println("Reading data from CSV file...");

        File file = new File(filePath);
        sc = new Scanner(file);
        sc.nextLine(); // skip header
        while(sc.hasNextLine()) {
            String[] line = sc.nextLine().split(",");
            String student = "student-" + studentCounter++;
            hashMap.put(student, line);
        }
    }

    public static void printData() {
        System.out.println("Printing data...");
        for(String key : hashMap.keySet()) {
            System.out.println(key + " " + Arrays.toString(hashMap.get(key)));
        }
    }

    public static void passedExams() {
        for(String key : hashMap.keySet()) {
            System.out.println("\nStatistics for " + key);
            int passedExams = 0;
            for(int i = 0; i < hashMap.get(key).length; i++) {
                if(Float.parseFloat(hashMap.get(key)[i]) >= 50) {
                    passedExams++;
                }
            }
            System.out.println("Passed exams: " + passedExams + " Out of: " + hashMap.get(key).length);
        }
    }




}
