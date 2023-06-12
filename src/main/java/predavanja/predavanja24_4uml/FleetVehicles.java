package predavanja.predavanja24_4uml;

import java.util.ArrayList;

public class FleetVehicles {

    private ArrayList<Vehicle> vehicles;

    public FleetVehicles() {
        vehicles = new ArrayList<>();
    }

    public void addVehicleToFleet(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            System.out.println("vehicle with car plate: " + vehicle.getCarPlate() + " already in fleet.");
        } else {
            vehicles.add(vehicle);
            System.out.println("added " + vehicle.getCarPlate() + " to fleet.");
        }
    }

    public Vehicle removeVehicleFromFleet (Vehicle vehicle) {
        Vehicle veh = null;
        if (vehicles.contains(vehicle)) {
            veh = vehicle;
            vehicles.remove(vehicle);
            System.out.println("Removed " + vehicle.getCarPlate() + " from fleet.");
        } else {
            System.out.println("vehicle with " + vehicle.getCarPlate() + " not in fleet, can't remove!");
        }
        return veh;
    }

    public void listAllVehiclesInFleet() {
        for(Vehicle veh : vehicles){
            System.out.println(veh);
        }
    }
}
