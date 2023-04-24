package predavanja.predavanja24_4;

import java.util.Comparator;
import java.util.Random;

public class Roboty implements Comparable<Roboty> {

    private static Random random = new Random();
    private String name;
    private  int id;
    private static int cntID = 10;
    private static final int MINLENGHT = 3;
    private static final int MAXLENGHT = 15;
    private static final String alph = "abcdefghijklmnoprstuvzxywABCDEFGHIJKLMNOPRSTUVZWXY123456789";
    private float batteryLevel;
    private boolean status;

    public Roboty() {
        this.name = generateName();
        this.id = cntID++;
        this.batteryLevel = 100;
        this.status = false;
    }

    public void discharge() {
        this.batteryLevel = random.nextFloat(0,100);
    }

    public float getBatteryLevel() {
        return this.batteryLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    private String generateName() {
        String name = "";
        int lenghtChars = random.nextInt(MINLENGHT, MAXLENGHT + 1);
        for (int i = 0; i < lenghtChars; i++) {
            name += alph.charAt(random.nextInt(0, alph.length()));
        }
        return name;
    }

    @Override
    public String toString() {
        String rep = "";
                if (status) {
                    rep = String.format("%-15s", batteryLevel);
                } else {
                    rep = String.format("%-15s", name);
                }
        return rep;
    }

    @Override
    public int compareTo(Roboty o) {
        if (this.getName().length() > o.getName().length()) {
            return 1;
        } else if (this.getName().length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
    }
}
