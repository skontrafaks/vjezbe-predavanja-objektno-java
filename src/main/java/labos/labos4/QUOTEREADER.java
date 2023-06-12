package labos.labos4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class QUOTEREADER {

    private static Map<String, String> myMap = new TreeMap<>();

    public static void readDataFromFile(String filePath)  {
        File file = new File(filePath);
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] tempArray = line.split(":");
                myMap.put(tempArray[0], tempArray[1].substring(1));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void listAllQuotes(){
        for (String key : myMap.keySet()) {
            System.out.println(key + ":");
            System.out.println(myMap.get(key));
            System.out.println();
        }
    }
}
