package predavanja.predavanja22_5;

import java.util.ArrayList;
import java.util.List;

public class TestSpaceProgram {

    public static void main(String[] args) {
        StarShip starShip1 = new StarShip("Apollo 10");
        System.out.println(starShip1);
        StarShip starShip2 = new StarShip("Enterprise 22");
        StarShip starShip3 = new StarShip("Millenium Falcon");

        ArrayList<StarShip> ships = new ArrayList<>();
        ships.add(starShip1);
        ships.add(starShip2);
        ships.add(starShip3);

        String fileName = "src\\predavanja\\predavanja22_5\\spaceProg1.bin";

        SerDeserial.writeToBinary(fileName, ships, false);
        ArrayList<StarShip> ships2 = SerDeserial.readFromBinaryFile(fileName);
        System.out.println(ships2);

        ArrayList<StarShip> ships3 = new ArrayList<>();
        ships3.add(new StarShip("Home One"));
        SerDeserial.writeToBinary(fileName, ships3, true);

        ships2 = SerDeserial.readFromBinaryFile(fileName);
        System.out.println(ships2);
    }


}
