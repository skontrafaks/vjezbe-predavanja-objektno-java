package vjezbe.vjezbe3.zadatak3;

public class SportsCar extends Vehicle{

    public SportsCar(String brand, String model, String date) {
        this.brand = brand;
        this.model = model;
        this.date = date;
    }

    @Override
    public void startVehicle() {
        System.out.println("Palim ovu sportsku 'mašinu'");
    }

    @Override
    public String toString() {
        return "Sport CAR[" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", vehID=" + vehID +
                ']';
    }
}
