package predavanja.predavanja24_4uml;

import java.util.concurrent.ThreadLocalRandom;

public class Vehicle {

    private MANUFACTURER manufacturer;
    private String model;
    private int years;
    private int id;
    private static int cntID = 237;
    private String carPlate;
    private static final int MINYR = 1;
    private static final int MAXYR = 30;
    private static final String CP = "ZD _ ";

    public Vehicle(MANUFACTURER manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.years = ThreadLocalRandom.current().nextInt(MINYR, MAXYR);
        this.id = cntID++;
        this.carPlate = CP + id;

    }

    public void driveVehicle() {
        System.out.println("Driving vehicle with car plate: " + carPlate);
    }

    public String getCarPlate() {
        return carPlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carPlate='" + carPlate + '\'' +
                '}';
    }
}
