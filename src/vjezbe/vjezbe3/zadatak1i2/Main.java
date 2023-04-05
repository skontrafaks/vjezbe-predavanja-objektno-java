package vjezbe.vjezbe3.zadatak1i2;

public class Main {

    public static void main(String[] args) {

        Robot robi = new Robot();
        robi.setID(420);
        robi.setName("Robi");
        robi.walk();
        System.out.println("Suma prvih brojeva= " + robi.sumaNBrojeva(4));
        System.out.println("Rezultat rekurzije unesenog broja je: " + robi.factJel(0));
        System.out.println("Potencija je = " + robi.potencijaNbroja(4, 3));

        while(robi.flag){

            robi.fillArr();

        }
        robi.print2dArray();

    }
}
