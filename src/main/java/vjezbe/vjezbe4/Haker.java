package vjezbe.vjezbe4;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Haker {

    private Semafor smf;
    private int[] rndBrojevi = new int[3];

    public Haker(Semafor smf) {
        this.smf = smf;
        System.out.println("This hacker took over - " + smf.toString());

    }

    public void noviKodovi() {

        for (int i = 0; i < 3; i++) {
            rndBrojevi[i] = ThreadLocalRandom.current().nextInt(11, 43);
        }
        System.out.println(Arrays.toString(rndBrojevi));
    }

    public void semaforHack() {
        smf.setCrveno(String.format("%d", rndBrojevi[0]));
        smf.setZeleno(String.format("%d", rndBrojevi[1]));
        smf.setZuto(String.format("%d", rndBrojevi[2]));
    }
}
