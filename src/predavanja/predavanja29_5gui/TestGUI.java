package predavanja.predavanja29_5gui;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class TestGUI {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel( new FlatDarkLaf());
            // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Can't run this look and feel");;
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
