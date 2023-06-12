package vjezbe10.zadatak2;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {

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
