package vjezbe10.zadatak1;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class App {

    public static void main(String[] args) {

        //todo alert when text field empty, scroll text area

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
        });
    }
}
