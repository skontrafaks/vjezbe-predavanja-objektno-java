package gui_attempt_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwesomePanel extends JPanel implements ActionListener {

    JButton disableInputButton;
    private AwesomePanelListener awesomePanelListener;

    public AwesomePanel() {

        setPreferredSize(new Dimension(200, FrameGUI.HEIGHT));
        setBorder(BorderFactory.createLineBorder(Color.BLUE));

        initComponents();
        layoutComponents();
        activateButtons();
    }

    public void setAwesomePanelListener(AwesomePanelListener awesomePanelListener) {
        this.awesomePanelListener = awesomePanelListener;
    }

    private void initComponents() {

        disableInputButton = new JButton("DISABLE INPUT");
    }

    private void layoutComponents() {

        add(disableInputButton);
    }

    private void activateButtons() {
        disableInputButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == disableInputButton) {

        }
    }
}
