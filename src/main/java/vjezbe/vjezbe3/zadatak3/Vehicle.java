package vjezbe.vjezbe3.zadatak3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle {

    String brand;
    String model;
    SimpleDateFormat dateFormater;
    int vehID;
    private static int autoInc = 300;
    Date productionDate;

    public Vehicle() {
        this.vehID = vehID + autoInc;
        autoInc++;
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.vehID = vehID + autoInc;
        autoInc++;
        dateFormater = new SimpleDateFormat("dd/MM/yyyy.");
    }

    public void setProductionDate(String dateProduced){
        try {
            productionDate = dateFormater.parse(dateProduced);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public void startVehicle() {
        System.out.println("Ovo vozilo je upaljeno");
    }

    public void stopVehicle() {
        System.out.println(getClass().getSimpleName() + " Zaustavljam vozilo!");
        System.out.println("Gasim motor.");
    }

    @Override
    public String toString() {
        return "Vehicle[" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + dateFormater.format(productionDate) +
                ", vehID=" + vehID +
                ']';
    }

    protected void vehInfo() {
        System.out.println(this);
    }

    private void additionalMethod() {
        System.out.println("This method does NOTHING!");
    }

}
