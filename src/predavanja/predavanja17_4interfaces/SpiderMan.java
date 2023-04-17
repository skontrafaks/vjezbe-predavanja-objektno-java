package predavanja.predavanja17_4interfaces;

public class SpiderMan extends Person implements Fly, Run{

    private boolean net;

    protected SpiderMan(String name, String occupation, int age) {
        super(name, occupation, age);
        this.net = true;
    }

    @Override
    public void flyAbbility() {
        if(net){
            System.out.println(getClass().getSimpleName() + " almost can fly...");
        } else {
            System.out.println("Probably fallin down...");
        }
    }

    @Override
    protected void provideExplanation() {
        System.out.println("This is my swim suit...");
    }

    @Override
    public void runningAbbility() {
        System.out.println("Better than most humans...");
    }
}
