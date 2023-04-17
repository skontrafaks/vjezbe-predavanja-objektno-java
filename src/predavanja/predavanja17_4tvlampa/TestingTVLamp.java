package predavanja.predavanja17_4tvlampa;

public class TestingTVLamp {

    public static void main(String[] args) {
        Lamp kucnaLampa = new Lamp();

        System.out.println(kucnaLampa);

        kucnaLampa.activateIntelligentMode();
        kucnaLampa.setBrigtness(6);

        System.out.println(kucnaLampa);

        Television philips = new Television();

        System.out.println(philips);

        philips.activateIntelligentMode();
        philips.setBrigtness(43);

        System.out.println(philips);

    }
}
