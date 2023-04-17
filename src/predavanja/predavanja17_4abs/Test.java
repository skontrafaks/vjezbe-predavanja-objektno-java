package predavanja.predavanja17_4abs;

public class Test {

    public static void main(String[] args) {
        MobilePhone iPhone = new MobilePhone("Apple", "AppleCPU", 128);
        iPhone.startDevice();
        int bl = iPhone.chargeDevice();
        System.out.println("Battery after charging is: " + bl);
        System.out.println(iPhone);
        iPhone.extendInternalMemory(128);
        System.out.println(iPhone);
    }
}
