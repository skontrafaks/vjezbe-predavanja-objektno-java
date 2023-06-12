package predavanja.predavanja17_4inner;

//anonimna klasa primjer
public class TestSound {

    public static void main(String[] args) {
        SimpleInterface sound = new SimpleInterface() {
            @Override
            public void produceSomeSound() {
                System.out.println("The sound is produced...");
            }
        };
        sound.produceSomeSound();
    }
}
