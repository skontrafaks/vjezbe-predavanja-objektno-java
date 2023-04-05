package vjezbe.vjezbe3.zadatak3;

public class VehClient {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Mercedes", "M101");
        v1.setProductionDate("20/02/2002.");
        v1.startVehicle();
        v1.stopVehicle();
        v1.vehInfo();
        System.out.println("-------------------------------------");
        SportsCar sc = new SportsCar("DF45", "Mustang", "blue");
        sc.startVehicle();
        sc.setSportCarProductionDate("22/02/1965.");
        System.out.println(sc);
        SedanCar sec = new SedanCar("nekimodel", "www", "green");
        sec.setProductionDate("08/08/1222.");
        sec.vehInfo();
    }
}
