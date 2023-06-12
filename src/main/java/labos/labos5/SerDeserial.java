package labos.labos5;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class SerDeserial {

    public static void saveUsr2File(String filepath, TreeMap<Integer, User> usrs) throws IOException {

        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filepath));
        for (Map.Entry<Integer,User> entry : usrs.entrySet()) {
            ous.writeObject(entry.getValue());
        }
        System.out.println("All saved to the file -> " + filepath);
        ous.close();
    }


    public static void readUsr4File(String filepath) throws IOException, ClassNotFoundException {

        System.out.println("\n<<<<<<<<<< All from file: >>>>>>>>>>>");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));
        try {
            while (true) {
                User temp_user = (User)ois.readObject();
                System.out.println(temp_user);
            }
        } catch (IOException ignored) {
            ;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}