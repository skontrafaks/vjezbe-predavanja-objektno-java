package predavanja.predavanja24_4uml;

public class TestFleet {

    public static void main(String[] args) {
        FleetVehicles fleetVehicles = new FleetVehicles();
        fleetVehicles.addVehicleToFleet(new Vehicle(MANUFACTURER.MercedesBenz, "CLK"));
        fleetVehicles.addVehicleToFleet(new Vehicle(MANUFACTURER.BMW, "X5"));
        Vehicle veh = new Vehicle(MANUFACTURER.Tesla, "M5");
        fleetVehicles.addVehicleToFleet(veh);
        fleetVehicles.addVehicleToFleet(veh);
        fleetVehicles.listAllVehiclesInFleet();
        Vehicle veh2 = new Vehicle(MANUFACTURER.Renault, "Clio");
        fleetVehicles.removeVehicleFromFleet(veh2);
        printALGiSP(20);
        int num = 20;
        Vehicle v = new Vehicle(MANUFACTURER.Peugeot, "308");
    }

    private static void printALGiSP(int repeat) {
        if (repeat == 0) {
            System.out.println("Gotovo...");
        } else {
            System.out.println("hahha");
            printALGiSP(repeat - 1);
        }
    }

}
