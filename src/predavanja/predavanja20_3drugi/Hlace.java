package predavanja.predavanja20_3drugi;

public class Hlace {

    private int width;
    private int height;
    private String material;
    private boolean isClear;

    public Hlace(String material, boolean isClear) {
        this.material = material;
        this.isClear = isClear;
        System.out.println("Hlace constructor");
    }
    public Hlace (int w, int h, String m, boolean isCl){
        this(m, isCl);
        height = h;
        width = w;
        System.out.println("Hlace constructor with params");
    }
    public Hlace notClear(boolean isCl){
        if (!isCl){
            this.isClear = isCl;
        }
        return this;
    }
    public void clearHlace(){
        if (this.isClear) System.out.println("Hlace is clear");
        else {
            System.out.println("Aktiviram pranje hlaca...");
            operihlace(this);
        }
    }

    private void operihlace(Hlace hlace){
        System.out.println("Proces pranja hlaca pocinje...");
        this.isClear = true;
        System.out.println("Proces pranja hlaca zavrsen!");
    }

    @Override
    public String toString() {
        return "Hlace{" +
                "width=" + width +
                ", height=" + height +
                ", material='" + material + '\'' +
                "hashcode=" + this.hashCode() +
                ", isClear=" + isClear +
                '}';
    }
}
