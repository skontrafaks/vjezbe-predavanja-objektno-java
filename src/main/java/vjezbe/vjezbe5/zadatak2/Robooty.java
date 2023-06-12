package vjezbe.vjezbe5.zadatak2;

import java.util.concurrent.ThreadLocalRandom;

public class Robooty implements CommonActions{

    private String name;
    private int id;
    private static int cntID = 134;

    public Robooty(String name) {
        this.name = name;
        this.id = cntID++;
    }


    @Override
    public void walk(String dir, int meters) {
        System.out.println("Yes, human\nHeading " + dir + " for " + meters + ".");
    }

    @Override
    public void talk() {
        System.out.println("Do you want to hear a fun fact about number "
                + ThreadLocalRandom.current().nextInt(1, 199) + "?");
    }

    @Override
    public void think(String thought) {
        System.out.println("A will think about -> " + thought);
    }

    @Override
    public int calculate(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + calculate(num - 1);
        }
    }
}
