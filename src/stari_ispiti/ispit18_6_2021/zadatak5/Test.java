package stari_ispiti.ispit18_6_2021.zadatak5;

public class Test {

    public static void main(String[] args) {
        Team team = new Team("BEST - TEAM", 3);
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        team.addPlayer(player1);
        team.addPlayer(player2);
        team.addPlayer(player2);
        team.addPlayer(player3);
        team.addPlayer(player4);

        team.saveTeamData2File("src\\stari_ispiti\\ispit18_6_2021\\zadatak5\\data.bin");
        team.readTeamDataFromFile("src/stari_ispiti/ispit18_6_2021/zadatak5/data.bin");
    }
}
