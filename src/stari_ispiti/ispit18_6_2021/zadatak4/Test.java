package stari_ispiti.ispit18_6_2021.zadatak4;

public class Test {

    public static void main(String[] args) {
        WorldCup wc1 = new WorldCup();
        wc1.worldCupInYear(8);

        String fileName = "src/stari_ispiti/ispit18_6_2021/zadatak4/worldcup.bin";
        wc1.saveToFile(fileName);
        wc1.worldCupInYear(5);
        wc1.saveToFile(fileName);

        wc1.readFromFile(fileName);
    }
}
