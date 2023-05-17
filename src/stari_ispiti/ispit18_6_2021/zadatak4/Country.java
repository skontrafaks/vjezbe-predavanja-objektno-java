package stari_ispiti.ispit18_6_2021.zadatak4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Country {

    private static String[] cntr = { "France", "Spain", "USA", "Croatia", "Deutschland", "Belgium", "Sweeden", "Canada",
            "Great Britain", "Russia", "Kongo", "Mexico", "Brasil", "Turkey", "S. Korea", "N. Korea", "Japan", "BiH",
            "Slovenia", "Chile", "Maroco", "New Zealand", "Australia", "Island", "Argentina", "Tunis"};

    public ArrayList<String> getParticipants(int numbOfPar) {
        ArrayList<String> participants;
        if (numbOfPar >= cntr.length) {
            participants = new ArrayList<>(Arrays.asList(cntr));
        } else {
            participants = new ArrayList<>();
            for (int i = 0; i < numbOfPar; i++) {
                participants.add(i, cntr[ThreadLocalRandom.current().nextInt(0, cntr.length)]);
            }
        }
        return participants;
    }
}
