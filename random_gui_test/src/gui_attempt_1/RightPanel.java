package gui_attempt_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightPanel extends JPanel implements ActionListener{

    private JButton addButton;
    private JButton clearButton;

    private RightPanelListener rightPanelListener;


    public RightPanel() {

        setPreferredSize(new Dimension(200, FrameGUI.HEIGHT));
        setBorder(BorderFactory.createLineBorder(Color.BLACK));

        initComponents();
        layoutComponents();
        activateButtons();
    }

    public void setRightPanelListener(RightPanelListener rightPanelListener) {
        this.rightPanelListener = rightPanelListener;
    }

    private void initComponents() {

        addButton = new JButton("ADD");
        addButton.setPreferredSize(new Dimension(150, 50));
        addButton.setBorderPainted(false);
        addButton.setFont(new Font("Helvetica", 10, 20));

        clearButton = new JButton("CLEAR");
        clearButton.setPreferredSize(new Dimension(100, 50));
    }

    private void layoutComponents() {

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.CENTER);
        add(addButton);
        add(clearButton);

    }

    private void activateButtons() {
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            rightPanelListener.addText("SOME COOL TXT BRO\n");
        } else if (e.getSource() == clearButton) {
            rightPanelListener.clearText();
        }
    }


}
