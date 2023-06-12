package vjezbe10.zadatak2;

public class Calculation {

    private double total;

    private float kredit;
    private float kamata;
    private int godina;
    private boolean mjesecno;
    private boolean kvartalno;

    public Calculation(float kredit, float kamata, int godina, boolean mjesecno, boolean kvartalno) {
        this.kredit = kredit;
        this.kamata = kamata;
        this.godina = godina;
        this.mjesecno = mjesecno;
        this.kvartalno = kvartalno;
        calculate();
    }

    public String getTotal() {
        String totalStr = String.format("%.2f", total);
        return totalStr;
    }

    private void calculate() {
        int nacin;
        if (mjesecno) {
            nacin = 12;
        } else {
            nacin = 4;
        }

        float intr = (kamata / 100) /nacin;
        int n = godina*12;
        double D = (Math.pow((1+intr), n)-1) / (intr*Math.pow((1+intr),n));
        total = kredit / D;
    }

    @Override
    public String toString() {
        String finalToString= "Kredit: " + kredit + "\n" +
                "Kamata: " + kamata * 0.01 + "\n" +
                "Godina: " + godina + "\n" +
                "Nacin: " + (mjesecno ? "mjesecno" : "kvartalno") +
                "\n" + "Total: " + total;

        return finalToString;
    }
}
