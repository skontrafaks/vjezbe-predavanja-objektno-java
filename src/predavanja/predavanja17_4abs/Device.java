package predavanja.predavanja17_4abs;

public abstract class Device {

    protected String manufacturer;
    protected int id;
    protected static int cntID = 1;
    protected int bateryLevel;

    protected Device(String manufacturer) {
        this.manufacturer = manufacturer;
        this.id = cntID++;
        this.bateryLevel = 0;
    }

    protected abstract void startDevice();
    protected abstract int chargeDevice();
    public void deviceInfo(){
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("Batery level: " + bateryLevel);
        System.out.println("Device ID: " + id);
    }
}
