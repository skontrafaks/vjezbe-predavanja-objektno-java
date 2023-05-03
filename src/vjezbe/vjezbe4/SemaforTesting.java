package vjezbe.vjezbe4;

public class SemaforTesting {

    public static void main(String[] args) {
        Semafor noviSem = new Semafor();
        System.out.printf("kodovi semafora su %s %s %s \n",
                noviSem.getCrveno(), noviSem.getZeleno(), noviSem.getZuto());
        Haker haki = new Haker(noviSem);
        haki.noviKodovi();
        haki.semaforHack();
        System.out.println("Semafor hakiran...");
        System.out.printf("kodovi semafora su %s %s %s \n",
                noviSem.getCrveno(), noviSem.getZeleno(), noviSem.getZuto());
        System.out.println(noviSem);

    }
}
