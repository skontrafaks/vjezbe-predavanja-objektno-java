package vjezbe.vjezbe3;

import java.util.ArrayList;
import static java.util.Collections.fill;
import static java.util.Collections.max;
import static java.util.Comparator.comparing;
import java.util.*;

public class Test {

    static void changeList(List<String> list) {


    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
