package gui_attempt_1;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {

    private JTextArea textArea;

    public LeftPanel() {

        setPreferredSize(new Dimension(200, FrameGUI.HEIGHT));
        setBorder(BorderFactory.createLineBorder(Color.RED));

        initComponents();
        layoutComponents();
    }

    private void initComponents() {

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(100, 100));
    }

    private void layoutComponents() {

        add(textArea);
    }

    public void addTextToTextField(String txt) {
        textArea.append(txt);
    }

    public void clearTextFromTextField() {
        textArea.setText("");
    }

    public void disableInputFromTextField() {
        textArea.setEditable(false);
    }
}
