package labos.labos1;

public class Test {

    public static void main(String[] args) {
        // kreirajte jedna objekt s korisničkim imenom Ivana
        CLS_FUND prviObjekt = new CLS_FUND("Ivana");
        // kreirajte drugi objekt isto s korisničkim imenom Ivana
        CLS_FUND drugiObjekt = new CLS_FUND("Ivana");
        // kreirajte novu referencu clsFund3 koja pokazuje na isti objekt kao prva referenca
        CLS_FUND clsFund3 = prviObjekt;
        // ispis prvog objekta
        System.out.println(prviObjekt);
        // ispis drugog objekta
        System.out.println(drugiObjekt);

        // pozovite metodu na nivou klase da pokaže vrijednost zajedničkog atributa
        CLS_FUND.clsData();
        // postavite novo ime prvom objektu na "Ivana-2"
        prviObjekt.setUserName("Ivana-2");
        // ispis tog objekta
        System.out.println(prviObjekt);

        // testirajte jesu li objekti 1 i 2 jednaki
        System.out.println("Object are equal or not: " + CLS_FUND.checkEquality(prviObjekt, drugiObjekt));
        // testirajte jesu li objekti na koji pokazuju treća i prva referenca jednaki
        System.out.println("Object are equal or not: " + CLS_FUND.checkEquality(prviObjekt, clsFund3));

    }
}