package predavanja.predavanja17_4abs;

public class MobilePhone extends Device {

    private int memory;
    private String cpu;

    protected MobilePhone(String manufacturer, String cpu, int memory) {
        super(manufacturer);
        this.cpu = cpu;
        this.memory = memory;
    }

    @Override
    protected void startDevice() {
        System.out.println(getClass().getSimpleName() + " power button on!");
    }

    @Override
    protected int chargeDevice() {
        if (bateryLevel < 20){
            System.out.println("battery level is: " + bateryLevel);
            System.out.println("Charging to max...");
            bateryLevel = 100;
        } else {
            System.out.println("Enough battery for the rest of the day.");
        }
        return bateryLevel;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "memory=" + memory +
                ", cpu='" + cpu + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", id=" + id +
                ", bateryLevel=" + bateryLevel +
                '}';
    }

    public void extendInternalMemory(int cap){
        System.out.println("Memory extended for -> " + cap);
        this.memory += cap;
    }
}
