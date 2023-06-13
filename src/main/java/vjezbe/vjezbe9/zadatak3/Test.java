package vjezbe.vjezbe9.zadatak3;

import vjezbe.vjezbe9.zadatak1i2.ObjectHandling;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Species species = Species.HUMAN;
        Species species2 = Species.EWOK;

        SpaceScientist spaceScientist = new SpaceScientist("Darko", "Programmer", null, species);
        ArrayList<SpaceScientist> spaceScientists = new ArrayList<>();

        ObjectHandling.writeToBinary("src/main/java/vjezbe/vjezbe9/zadatak3/objects.bin", spaceScientists, false);
        ObjectHandling.readFromBinaryFile("src/main/java/vjezbe/vjezbe9/zadatak3/objects.bin");

    }
}
