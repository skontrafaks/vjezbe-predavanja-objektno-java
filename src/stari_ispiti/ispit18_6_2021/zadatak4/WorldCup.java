package stari_ispiti.ispit18_6_2021.zadatak4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WorldCup {

    private Scanner sc;
    private ArrayList<String> part = new ArrayList<>();
    private Country country;
    private String year;

    public void worldCupInYear(int numberOfPart) {
        System.out.println("What year do you want to see? ");
        sc = new Scanner(System.in);
        year = sc.nextLine();

        Country cntrs = new Country();
        part = cntrs.getParticipants(numberOfPart);
    }

    public void listParticipants() {
        System.out.println(part);
    }

    public void saveToFile(String fileName) {
        String writeToFile = "Participants in the World Cup - " + year;
        for (String country : part) {
            writeToFile += "\n" + country;
        }
        File file = new File(fileName);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(writeToFile);
            writer.newLine();
            writer.write("---------------------------------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readFromFile(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
