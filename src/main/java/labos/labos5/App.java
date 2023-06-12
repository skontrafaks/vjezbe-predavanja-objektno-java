package labos.labos5;

// uvoz za strukturu mape koja se traži

import java.io.IOException;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {

        String filePath = "src/main/java/labos/labos5/UsersFile.bin";
        User user1 = new User("Name_01", "mail_01@company.org");
        User user2 = new User("Name_02", "mail_02@network.net");
        User user3 = new User ("Name_03", "mail_03@organization.com");

        TreeMap<Integer, User> treeMap = new TreeMap<>();
        treeMap.put(user1.getId(), user1);
        treeMap.put(user2.getId(), user2);
        treeMap.put(user3.getId(), user3);

        // spremi mapu u datoteku -> filepath
        try {
            SerDeserial.saveUsr2File(filePath, treeMap);
            SerDeserial.readUsr4File(filePath);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
