package predavanja.predavanja20_3;

public class TestApp {

    public static void main(String[] args) {
        User usr = new User("John", "Simple user");
        User newUsr = new User("user2", "again simple user");
        usr.instantMsgFromUser("Hello dude!");

        System.out.println(usr);
        System.out.println(newUsr);

        SuperUser superUsr = new SuperUser("SuperUser", "Super ultimate user");
        superUsr.instantMsgFromUser("Hello super!");


        System.out.println(superUsr);
    }
}
