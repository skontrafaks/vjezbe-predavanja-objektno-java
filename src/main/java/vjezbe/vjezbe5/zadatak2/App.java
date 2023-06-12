package vjezbe.vjezbe5.zadatak2;

public class App {

    public static void main(String[] args) {
        FamousPerson lukaModric = new FamousPerson("Luka", 35);
        lukaModric.walk("south", 123);
        lukaModric.talk();
        lukaModric.think("football");
        System.out.println(lukaModric.calculate(2));

        Robooty robislav = new Robooty("Robislav");
        robislav.walk("west", 321);
        robislav.talk();
        robislav.think("Battery");
        System.out.println(robislav.calculate(12));
    }

}
