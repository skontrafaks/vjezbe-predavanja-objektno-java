package predavanja.predavanja15_5game_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class AUXGAMECLS {

    public static void playGame(Scanner scanner, String filePath) {
        Set<Integer> nums = readDataToSetStructure(filePath, scanner);
        scanner = new Scanner(System.in);
        int numToGuess = getRandomFromDataStructure(nums);
        System.out.println("Please enter your guess for age...");
        String guessAsString = scanner.nextLine();
        try {
            int guess = Integer.parseInt(guessAsString);
            if (guess == numToGuess) {
                System.out.println("You WIN!!!");
            } else {
                System.out.println("Your guess: " + guess + " | number to guess: " + numToGuess);
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong input dummy...");
        }
    }

    public static Set<Integer> readDataToSetStructure(String filePath, Scanner scanner) {
        File file = new File(filePath);
        Set<Integer> numbers = new HashSet<>();
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int value = Integer.parseInt(line);
                    numbers.add(value);
                } catch (NumberFormatException e) {
                    System.out.println("Not allowed format for integer...");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return numbers;
    }

    public static int getRandomFromDataStructure(Set<Integer> nums) {
        int indx = ThreadLocalRandom.current().nextInt(0, nums.size());
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        // resolve return value
        return arr[indx];
    }
}
