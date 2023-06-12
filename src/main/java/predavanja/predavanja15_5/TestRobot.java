package predavanja.predavanja15_5;

import java.util.ArrayList;
import java.util.List;

public class TestRobot {

    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>();
        robots.add(new IndustrialRobot("FFG111"));
        robots.add(new IndustrialRobot("AHG1122"));
        robots.add(new HomeAssistantRobot("HOME ROBI"));
        robots.add(new IndustrialRobot("NME1"));

    }
}
