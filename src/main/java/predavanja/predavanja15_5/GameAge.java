package predavanja.predavanja15_5;

import javax.naming.directory.InvalidAttributeValueException;
import javax.naming.directory.InvalidAttributesException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameAge {

    private static Scanner scanner;
    private static boolean status;
    private static ArrayList<Integer> ages;

    public static void main(String[] args) {
        enterAge();
    }

    private static void checkAge(int ageVal) throws InvalidAttributeValueException {
        if (ageVal <= 0 || ageVal > 120) {
            System.out.println("Wrong value - must be 1 or greater till 120");
            throw new InvalidAttributeValueException("This value is not allowed");
        } else {
            System.out.println("You have entered acceptable age value: " + ageVal);
        }
    }

    private static float averageAge(ArrayList<Integer> ages) {
        long sumVals = 0;

        for(Integer val : ages) {
            sumVals += val;
        }

        return sumVals / ages.size();
    }

    private static void enterAge() {
        status = true;
        scanner = new Scanner(System.in);
        ages = new ArrayList<>();

        while (status) {
            int age = 0;
            try {
                System.out.println("Enter your age value as integer: ");
                age = scanner.nextInt();
                checkAge(age);
                ages.add(age);
            } catch (InputMismatchException e) {
                System.out.println("Integer is needed.\n\n");;
            } catch (InvalidAttributeValueException e) {
                System.out.println(e.getMessage() + "\n\n");
            } finally {
                scanner.nextLine();
                System.out.println("For new input y and n for exit.");
                String cont = scanner.next();
                if(cont.equalsIgnoreCase("y")) {
                    System.out.println("Proceed to new age input...");
                } else {
                    System.out.println("Exit from inputs...");
                    status = false;
                }
            }
        }
        System.out.println(ages);
        System.out.println("Average age is: " + averageAge(ages));
    }


}
