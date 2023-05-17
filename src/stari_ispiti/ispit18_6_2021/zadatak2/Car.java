package stari_ispiti.ispit18_6_2021.zadatak2;

public class Car extends Vehicle{
    private String model;

    public Car(String model) {
        this.model = model;
        this.id = cntID++;
    }

    @Override
    public void runEngine() {
        System.out.println("Running CAR engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping engine...");
    }

    @Override
    public void getEnergy() {
        System.out.println("Stopping at gas station...");
    }

    @Override
    public void description() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public void move(String direction, double dist) {
        System.out.println("Moving to " + direction);
        System.out.println("For " + dist);
    }
}
