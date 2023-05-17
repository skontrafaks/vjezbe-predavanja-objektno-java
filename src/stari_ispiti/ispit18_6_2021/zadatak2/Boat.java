package stari_ispiti.ispit18_6_2021.zadatak2;

public class Boat extends Vehicle{

    private String boatName;

    public Boat(String boatName) {
        this.boatName = boatName;
        this.id = cntID;
    }


    @Override
    public void runEngine() {
        System.out.println("Running boat engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping boat engine");
    }

    @Override
    public void getEnergy() {
        System.out.println("Solar powered boat, so just collecting sun...");
    }

    @Override
    public void description() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boatName='" + boatName + '\'' +
                '}';
    }

    @Override
    public void move(String direction, double dist) {
        System.out.println("Moving to " + direction);
        System.out.println("For miles " + dist);
    }
}
