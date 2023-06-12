package vjezbe.vjezbe6;


import java.util.*;

public class Zadatak3 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        put5RandomValues(hashSet);
        put5RandomValues(linkedHashSet);
        put5RandomValues(treeSet);

        searchForNemaGa(hashSet);
        System.out.println();
        searchForNemaGa(hashSet);

        printSet(hashSet);
        printSet(linkedHashSet);
        printSet(treeSet);

        searchForNemaGa(hashSet);
        printSet(hashSet);

        removeFromSet("Nema ga", hashSet);
        printSet(hashSet);

    }

    private static void put5RandomValues(Set<String> eSet) {

        for (int i = 0; i < 5; i++) {
            eSet.add(String.valueOf(UUID.randomUUID()));
        }
    }

    private static void searchForNemaGa(Set<String> eSet) {
        boolean statusNemaGa = false;

        for (String string : eSet) {
            if (string.equalsIgnoreCase("Nema ga")) {
                System.out.println("NEMA GA is in set");
                statusNemaGa = true;
                break;
            }
        }

        if (!statusNemaGa) {
            System.out.println("no NEMA GA in set!");
            eSet.add("Nema ga");
            System.out.println("Added NEMA GA to set...");
        }
    }

    private static void printSet(Set<String> eSet) {
        System.out.println("------------" + eSet.getClass().getSimpleName() + "------------");
        for (String string : eSet) {
            System.out.println(string);
        }
    }

    private static void removeFromSet(String object, Set<String> eSet) {
        eSet.remove(object);
    }

}
