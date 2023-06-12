package predavanja.predavanja17_4tvlampa;

public class Lamp implements Settings{

    private int brightness = 0;
    private boolean intMode = false;

    public Lamp() {
        this.brightness = brightness;
        this.intMode = intMode;
    }

    @Override
    public void setBrigtness(int newBrightness) {
        if (newBrightness > 10 || newBrightness < 0) {
            System.out.println("Can't adjust lighting of the lamp");
        } else {
            System.out.println("Promjenili brightness lampe");
            this.brightness = newBrightness;
        }
    }

    @Override
    public void activateIntelligentMode() {
        System.out.println("Stisnili botun za paljenje lampe... ");
        this.intMode = true;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "brightness=" + brightness +
                ", intMode=" + intMode +
                '}';
    }
}
