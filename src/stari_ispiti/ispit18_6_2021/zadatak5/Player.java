package stari_ispiti.ispit18_6_2021.zadatak5;

import java.io.Serializable;

public class Player implements Serializable {

    private int id;
    private static int idCounter = 0;

    public Player() {
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                '}';
    }
}
