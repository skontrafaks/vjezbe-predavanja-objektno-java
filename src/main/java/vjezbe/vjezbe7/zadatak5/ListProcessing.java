package vjezbe.vjezbe7.zadatak5;

import java.util.Iterator;
import java.util.List;

public class ListProcessing {

    public static <E> void insertVeh(List<E> eList, E element) {
        int index = -1;
        for (int i = 0; i < eList.size(); i++) {
            E elem = eList.get(i);
            if (elem.equals("electronic bike")) {
                index = i + 1;
                break;
            }
        }
        eList.add(index, element);
    }
}
