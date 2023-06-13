package vjezbe.vjezbe9.zadatak1i2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GunslingerCSV {

    public static void saveGunslingersToCSV(List<Gunslinger> gunslingers, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Gunslinger gunslinger : gunslingers) {
                writer.println(gunslingerToCSVString(gunslinger));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Gunslinger> loadGunslingersFromCSV(String filePath) {
        List<Gunslinger> gunslingers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Gunslinger gunslinger = gunslingerFromCSVString(line);
                if (gunslinger != null) {
                    gunslingers.add(gunslinger);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gunslingers;
    }

    private static String gunslingerToCSVString(Gunslinger gunslinger) {
        return String.format("%s,%d,%d,%s,%b",
                gunslinger.getName(),
                gunslinger.getAge(),
                gunslinger.getDuels(),
                gunslinger.getStrongHand(),
                gunslinger.isTwoGuns());
    }

    private static Gunslinger gunslingerFromCSVString(String csvString) {
        String[] values = csvString.split(",");
        if (values.length == 5) {
            String name = values[0].trim();
            int age = Integer.parseInt(values[1].trim());
            int duels = Integer.parseInt(values[2].trim());
            String strongHand = values[3].trim();
            boolean twoGuns = Boolean.parseBoolean(values[4].trim());
            Gunslinger gunslinger = new Gunslinger(name);
            gunslinger.setAge(age);
            gunslinger.setDuels(duels);
            gunslinger.setStrongHand(strongHand);
            gunslinger.setTwoGuns(twoGuns);
            return gunslinger;
        }
        return null;
    }
}
