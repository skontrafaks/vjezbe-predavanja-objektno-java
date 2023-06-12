package vjezbe.vjezbe2; //nije gotovo

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;
public class Zad8ProfRijesenje {

    private static final double MINDOUBLE = 0.0;
    private static final double MAXDOUBLE = 2000.0;

    public static void main(String[] args) {
        //generateDoubleArray
        Double[] genArrayDouble = new Double[5];

        for (int k = 0; k < 5; k++) {
            Double randomDouble = ThreadLocalRandom.current().nextDouble(MINDOUBLE, MAXDOUBLE);
            genArrayDouble[k] = randomDouble;
        }

        System.out.println("Creating array...");
        System.out.println(Arrays.toString(genArrayDouble));

        Arrays.sort(genArrayDouble,
                new ComparatorDescendingDouble());
        System.out.println("sorting...");
        System.out.println(Arrays.toString(genArrayDouble));
        System.out.println("Finished sorting!");
        Comparator<Double> doubleComparator = Collections.reverseOrder();

        Arrays.sort(genArrayDouble, doubleComparator);
        System.out.println(Arrays.toString(genArrayDouble));

    }

    private static class ComparatorDescendingDouble implements Comparator <Double> {

        @Override
        public int compare(Double o1, Double o2) {
            return o2.compareTo(o1);
        }
    }

}