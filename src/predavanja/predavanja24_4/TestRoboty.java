package predavanja.predavanja24_4;

import java.util.*;

public class TestRoboty {

    public static void main(String[] args) {

        List<Roboty> robots = generateListOFRobots(7);
        System.out.println(robots);
        Collections.sort(robots);
        System.out.println("sorted list: ");
        System.out.println(robots);
        Collections.reverse(robots);
        System.out.println("reverse sort:");
        System.out.println(robots);
        changeStatus((ArrayList<Roboty>) robots);
        Collections.sort(robots, new RobotBateryComparator());
        System.out.println("when sorting by battery level: ");
        System.out.println(robots);



    }

    private static ArrayList<Roboty> generateListOFRobots(int numRobots){
        ArrayList<Roboty> robots = new ArrayList<>(numRobots);
        for (int i = 0; i < numRobots; i++) {
            robots.add(new Roboty());
        }
        return robots;

    }

    private static void changeStatus(ArrayList<Roboty> robots) {
        for(Roboty robi : robots) {
            robi.setStatus(true);
            robi.discharge();
        }
    }

    static class RobotBateryComparator implements Comparator<Roboty> {


        @Override
        public int compare(Roboty ro1, Roboty ro2) {
            if (ro1.getBatteryLevel() > ro2.getBatteryLevel()) {
                return 1;
            } else if(ro1.getBatteryLevel() < ro2.getBatteryLevel()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
