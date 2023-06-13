package vjezbe.vjezbe9.zadatak1i2;

import java.io.Serializable;
import java.time.LocalDate;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDuels() {
        return duels;
    }

    public void setDuels(int duels) {
        this.duels = duels;
    }

    public String getStrongHand() {
        return strongHand;
    }

    public void setStrongHand(String strongHand) {
        this.strongHand = strongHand;
    }

    public boolean isTwoGuns() {
        return twoGuns;
    }

    public void setTwoGuns(boolean twoGuns) {
        this.twoGuns = twoGuns;
    }
}
