package vjezbe.vjezbe3.zadatak3;

public class Vehicle {

    protected String brand;
    protected String model;
    protected String date;
    protected int vehID;
    protected static int autoInc = 300;

    public Vehicle() {
        this.vehID = vehID + autoInc;
        autoInc++;
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.vehID = vehID + autoInc;
        autoInc++;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void startVehicle() {
        System.out.println("Ovo vozilo je upaljeno");
        boolean vehOn = true;
    }

    public void stopVehicle() {
        System.out.println("Zaustavljam vozilo!");
        System.out.println("Gasim motor.");
    }

    @Override
    public String toString() {
        return "Vehicle[" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", vehID=" + vehID +
                ']';
    }

    protected void vehInfo() {
        System.out.println(toString());
    }

    private void additionalMethod() {
        System.out.println("This method does NOTHING!");
    }

}
