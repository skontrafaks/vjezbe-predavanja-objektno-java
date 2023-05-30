package stari_ispiti.ispit18_6_2021.zadatak5;

import java.io.*;
import java.util.LinkedHashSet;

public class Team implements Serializable {

    private String name;
    private LinkedHashSet<Player> players;
    private final int MAXPLAYERS;

    public Team(String name, int maxPlayers) {
        this.name = name;
        this.MAXPLAYERS = maxPlayers;
        this.players = new LinkedHashSet<>();
    }

    public void addPlayer(Player player) {
        if (players.size() < MAXPLAYERS) {
            players.add(player);
            System.out.println(player + " added to team ->" + this);
        } else {
            System.out.println("Team is full, can't add player -> " + player);
        }
    }

    public void listPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void saveTeamData2File(String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            System.out.println("\nTeam data saved to file!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void readTeamDataFromFile(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Team team = (Team) ois.readObject();
            System.out.println("All data from file " + fileName + " read successfully!");
            System.out.println(team);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", MAXPLAYERS=" + MAXPLAYERS +
                '}';
    }
}
