package predavanja.predavanja17_4inner;

public class Test {

    public static void main(String[] args) {
        Vanjska outerClass = new Vanjska("Simple vanjska class...");
        outerClass.outerInfo();
        //prvi nacin kreiranja inner objekta
        Vanjska.INNER inr1 = outerClass.new INNER();
        inr1.innerInfo();
        //drugi nacin kreiranja inner objekta
        Vanjska.INNER inr2 = outerClass.createInnerObj();
        inr2.innerInfo();
        Vanjska.InnerOnArrays.adddElementToArray(100);
        Vanjska.InnerOnArrays.adddElementToArray(1001);

    }
}
