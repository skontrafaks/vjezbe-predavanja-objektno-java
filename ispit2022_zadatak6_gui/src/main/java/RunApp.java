import com.formdev.flatlaf.FlatIntelliJLaf;
import controller.AUXCLS;
import model.User;
import view.MainFrame;

import javax.swing.*;

public class RunApp {

    public static void main(String[] args) {

        User user1 = new User("user1", "brajo123@da.com", 1);
        User user2 = new User("user2", "mateIzpridrage@123.org", 2);
        User user3 = new User("user3", "poljicaZupan@jak.per", 3);
        User user4 = new User("user4", "samoInstagramDraga@ivana23.da", 4);
        AUXCLS.addUser(user1);
        AUXCLS.addUser(user2);
        AUXCLS.addUser(user3);
        AUXCLS.addUser(user4);

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
            }
        });
    }
}
