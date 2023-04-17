package predavanja.predavanja17_4interfaces;

public class SuperMan extends Person implements Fly, Run, SuperVision{

    private boolean mood;

    protected SuperMan(String name, String occupation, int age) {
        super(name, occupation, age);
        this.mood = false;
    }

    @Override
    public void flyAbbility() {
        System.out.println("Can fly better then plane...");
    }

    @Override
    protected void provideExplanation() {
        System.out.println("Where are my glasses?");
    }

    @Override
    public void runningAbbility() {
        System.out.println("faster then flash...");
    }


    @Override
    public void enableSuperVision() {
        if (!mood){
            System.out.println("ON");
        } else {
            System.out.println("Leave me alone...");
        }
    }
}
