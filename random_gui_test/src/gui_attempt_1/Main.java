package gui_attempt_1;

import com.formdev.flatlaf.FlatDarkLaf;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Can't run this look and feel");;
        }

        FrameGUI frame = new FrameGUI();
    }
}
