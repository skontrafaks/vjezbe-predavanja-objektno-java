package predavanja.predavanja15_5;

public class IndustrialRobot extends Robot {

    protected IndustrialRobot(String name) {
        super(name);
    }

    @Override
    protected void performSomeAction() {
        System.out.println(getClass().getSimpleName() + " performing some industrial actions...");
    }
}
