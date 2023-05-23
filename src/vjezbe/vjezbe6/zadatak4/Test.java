package vjezbe.vjezbe6.zadatak4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Roobot robi1 = new Roobot(15, "flying robot");
        Roobot robi2 = new Roobot(18, "talking robot");
        Roobot robi3 = new Roobot(90, "cleaning robot");
        Roobot robi4 = new Roobot(78, "smart robot");
        Roobot robi5 = new Roobot(65, "fast robot");

        Set<Roobot> robots = new LinkedHashSet<>();
        robots.add(robi1);
        robots.add(robi2);
        robots.add(robi3);
        robots.add(robi4);
        robots.add(robi5);

        printSet(robots);
        System.out.println("\n\nAdding flying robot again...");
        robots.add(new Roobot(15, "flying robot"));
        printSet(robots);
    }

    private static void printSet(Set<Roobot> eSet) {
        System.out.println("------------" + eSet.getClass().getSimpleName() + "------------");
        for (Roobot robot : eSet) {
            System.out.println(robot);
        }
    }
}
