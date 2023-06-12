package predavanja.predavanja17_4interfaces;

public class TestSuperHeroes {

    public static void main(String[] args) {
        SpiderMan sp = new SpiderMan("Peter", "PhotoReporter", 21);
        SuperMan sm = new SuperMan("Clark", "Reported", 33);
        sp.flyAbbility();
        sp.runningAbbility();
        sm.runningAbbility();
        sm.enableSuperVision();
        sm.flyAbbility();
    }
}
