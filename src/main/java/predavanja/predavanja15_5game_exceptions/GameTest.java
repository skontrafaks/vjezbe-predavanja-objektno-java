package predavanja.predavanja15_5game_exceptions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GameTest {

    private static Scanner scanner;

    public static void main(String[] args) {
        String filePath = "src/predavanja/predavanja15_5game_exceptions/ageData.txt";
//        Set<Integer> nums = new HashSet<>();
//        nums = AUXGAMECLS.readDataToSetStructure(filePath, scanner);
//        System.out.println(nums);
//        int num = AUXGAMECLS.getRandomFromDataStructure(nums);
//        System.out.println(num);
        AUXGAMECLS.playGame(scanner, filePath);
    }
}
