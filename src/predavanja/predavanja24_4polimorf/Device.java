package predavanja.predavanja24_4polimorf;

public class Device {

    public Device() {
        System.out.println("Device object created...");
    }

    public void powerOnDevice(int hrs) {
        System.out.println("device is powered: " + hrs);
    }

    public void powerOnDevice(int hrs, String who) { //method overload
        System.out.println(String.format("%-10s is powering to: %-10d", who, hrs));
    }
}
