package predavanja.predavanja24_4uml;

public class TestFleet {

    public static void main(String[] args) {
        FleetVehicles fleetVehicles = new FleetVehicles();
        fleetVehicles.addVehicleToFleet(new Vehicle("Mercedes", "CLK"));
        fleetVehicles.addVehicleToFleet(new Vehicle("BMW", "X5"));
        Vehicle veh = new Vehicle("Tesla", "M5");
        fleetVehicles.addVehicleToFleet(veh);
        fleetVehicles.addVehicleToFleet(veh);
        fleetVehicles.listAllVehiclesInFleet();
        Vehicle veh2 = new Vehicle("Renault", "Clio");
        fleetVehicles.removeVehicleFromFleet(veh2);
    }

}
