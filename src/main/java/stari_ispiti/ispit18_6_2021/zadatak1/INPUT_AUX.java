package stari_ispiti.ispit18_6_2021.zadatak1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class INPUT_AUX {

    static String[] array = {"this", "that", "new"};
    static List<String> ourStrings = new ArrayList<>(Arrays.asList(array));

        public static boolean checkInput(Scanner sc) {
            boolean isInt = sc.hasNextInt();
            boolean isDouble = sc.hasNextDouble();
            boolean ourInput;

            if (isInt || isDouble) {
                ourInput = false;
            } else {
                ourInput = true;
            }
            return ourInput;
        }

        public static void inList(Scanner sc) {
            System.out.println("Type a string:");
            sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (ourStrings.contains(input)) {
                System.out.println(input + " is in the list: " +ourStrings);
            } else {
                System.out.println(input + " not in the  list");
            }

        }

        public static void moreInputs() {
            Scanner sc = new Scanner(System.in);
            while (checkInput(sc)){
                inList(sc);
            }
        }

}
