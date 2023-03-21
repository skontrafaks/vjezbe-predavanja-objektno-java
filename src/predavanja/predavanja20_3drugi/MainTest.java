package predavanja.predavanja20_3drugi;

public class MainTest {

    public static void main(String[] args) {
        Hlace hlace = new Hlace(10, 20, "cotton", true);
        System.out.println(hlace);
        Hlace hl2 = hlace.notClear(false);
        System.out.println(hl2);
        hlace.clearHlace();
        System.out.println(hlace);
    }
}
