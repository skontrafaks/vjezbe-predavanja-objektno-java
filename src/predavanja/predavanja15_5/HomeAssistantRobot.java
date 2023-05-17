package predavanja.predavanja15_5;

public class HomeAssistantRobot extends Robot{

    protected HomeAssistantRobot(String name) {
        super(name);
    }

    @Override
    protected void performSomeAction() {
        System.out.println(getClass().getSimpleName() + " performing some home asistance...");
    }
}
