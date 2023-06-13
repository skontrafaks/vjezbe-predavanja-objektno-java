package vjezbe.vjezbe9.zadatak1i2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String csvFilePath = "src/main/java/vjezbe/vjezbe9/zadatak1/gns.csv";
        String filePath = "src/main/java/vjezbe/vjezbe9/zadatak1/objects.bin";
        Gunslinger gunslinger1 = new Gunslinger("DARKO", "RIGHT", true, 1988);
        ArrayList<Gunslinger> gunslingers = new ArrayList<>();
        gunslingers.add(gunslinger1);

        ObjectHandling.writeToBinary(filePath, gunslingers, false);
        System.out.println(ObjectHandling.readFromBinaryFile(filePath));

        GunslingerCSV.saveGunslingersToCSV(gunslingers, csvFilePath);
        GunslingerCSV.loadGunslingersFromCSV(csvFilePath).forEach(System.out::println);

    }
}
