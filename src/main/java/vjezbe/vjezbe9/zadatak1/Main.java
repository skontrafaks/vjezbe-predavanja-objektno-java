package vjezbe.vjezbe9.zadatak1;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String filePath = "src/vjezbe/vjezbe9/zadatak1/objects.bin";
        Gunslinger gunslinger1 = new Gunslinger("DARKO", "RIGHT", true, 1988);
        ArrayList<Gunslinger> gunslingers = new ArrayList<>();
        gunslingers.add(gunslinger1);

        ObjectHandling.writeToBinary(filePath, gunslingers, false);
        System.out.println(ObjectHandling.readFromBinaryFile(filePath));
    }
}
