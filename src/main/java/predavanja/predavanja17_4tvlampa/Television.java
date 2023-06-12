package predavanja.predavanja17_4tvlampa;

public class Television implements Settings{

    private int brightness;
    private boolean intMode;

    public Television() {
        this.brightness = brightness;
        this.intMode = intMode;
    }

    @Override
    public void setBrigtness(int newBrightness) {
        if (newBrightness > 100 || newBrightness < 0) {
            System.out.println("Can't adjust lighting");
        } else {
            System.out.println("mjenjamo brightness tv-a");
            this.brightness = newBrightness;
        }
    }

    @Override
    public void activateIntelligentMode() {
        System.out.println("Pljesnili smo ");
        this.intMode = true;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brightness=" + brightness +
                ", intMode=" + intMode +
                '}';
    }
}
