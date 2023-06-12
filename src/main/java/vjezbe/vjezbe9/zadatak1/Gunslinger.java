package vjezbe.vjezbe9.zadatak1;

import predavanja.predavanja22_5.SerDeserial;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.concurrent.ThreadLocalRandom;

public class Gunslinger implements Serializable {

    private String name;
    private int age;
    private int duels;
    private String strongHand;
    private boolean twoGuns;

    public Gunslinger(String name) {
        this.name = name;
    }

    public Gunslinger(String name, String strongHand, boolean twoGuns, int birthYear) {
        this.name = name;
        this.strongHand = strongHand;
        this.duels = ThreadLocalRandom.current().nextInt(1, 35);
        this.twoGuns = twoGuns;
        this.age = genAge(birthYear);
    }

    private int genAge(int birthYear) {
        LocalDate currentTime = LocalDate.now();
        long currentLong = currentTime.toEpochDay();
        int currentInt = (int) currentLong;

        LocalDate birthDate = LocalDate.of(birthYear, 1, 1);
        long birthLong = birthDate.toEpochDay();
        int birthInt = (int) birthLong;

        int age = (currentInt / 365) - (birthInt / 365);

        return age;
    }

    @Override
    public String toString() {
        return "Gunslinger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", duels=" + duels +
                ", strongHand='" + strongHand + '\'' +
                ", twoGuns=" + twoGuns +
                '}';
    }
}
