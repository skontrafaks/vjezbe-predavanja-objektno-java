package predavanja.predavanja17_4inner;

import java.util.ArrayList;

public class Vanjska {

    private String desc;
    private static final String OUTER = "Vanjska CLASS";
    private static ArrayList<Integer> lst;

    public Vanjska(String desc){
        this.desc = desc;
        lst = new ArrayList<>();
    }

    static class InnerOnArrays{

        static void adddElementToArray(Integer element){
            lst.add(element);
            System.out.println("Added element to list is -> " + element);
            System.out.println(lst);
        }
    }

    class INNER{
        public INNER(){
            System.out.println("Creating inner class object instance...");
        }

        public void innerInfo(){
            System.out.println(getClass().getSimpleName());
            System.out.println("Outter class -> " + OUTER);
            System.out.println("@" + Integer.toHexString(this.hashCode()));
        }
    }

    public void outerInfo(){
        System.out.println("desc: " + desc);
        System.out.println(getClass().getSimpleName());
    }

    public INNER createInnerObj(){
        return new INNER();
    }
}
