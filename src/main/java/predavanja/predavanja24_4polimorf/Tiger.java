package predavanja.predavanja24_4polimorf;

public class Tiger extends Animal{

    @Override
    public void produceSound() {
        // super.produceSound();
        System.out.println(getClass().getSimpleName() + ": ROAARR roaarr arghhh");
    }

    public void huntPrey() {
        System.out.println("Tigar is hunting...");
    }
}
