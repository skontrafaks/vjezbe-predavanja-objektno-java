package predavanja.predavanja29_5gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel {

    private JButton clickButton;
    private JTextField nameField;
    private JTextField surnameField;
    private JRadioButton radioPython;
    private JRadioButton radioJava;
    private JRadioButton radioSwing;
    private ButtonGroup buttonGroup;

    private BottomPanelListener bottomPanelListener;

    public BottomPanel() {

        initComps();
        layoutComps();
        activateComps();
    }

    public void setBottomPanelListener(BottomPanelListener bottomPanelListener) {
        this.bottomPanelListener = bottomPanelListener;
        System.out.println("Bottom panel listener: " + (bottomPanelListener != null));
    }

    private void initComps() {
        Dimension dims = this.getPreferredSize();
        dims.height = 200;
        this.setPreferredSize(dims);
        clickButton = new JButton("Press... harder!");
        nameField = new JTextField(10);
        surnameField = new JTextField(10);
        radioPython = new JRadioButton("Python");
        radioPython.setActionCommand("Python");
        radioJava = new JRadioButton("Java");
        radioJava.setActionCommand("Java");
        radioSwing = new JRadioButton("Swing");
        radioSwing.setActionCommand("Swing");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioPython);
        buttonGroup.add(radioJava);
        buttonGroup.add(radioSwing);
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridy = 0;
        gc.gridx = 0;
        add(new JLabel("Name: "), gc);

        gc.gridx++;
        add(nameField, gc);

        gc.gridx--;
        gc.gridy++;
        add(new JLabel("Surname: "), gc);

        gc.gridx++;
        add(surnameField, gc);

        gc.gridx++;
        gc.gridy--;
        add(Box.createHorizontalStrut(15), gc);

        gc.gridx++;
        add(new Label("Programming language: "), gc);

        gc.gridx++;
        gc.gridy++;
        add(radioPython, gc);

        gc.gridy++;
        add(radioJava, gc);

        gc.gridy++;
        add(radioSwing, gc);

        gc.gridx++;
        gc.gridy++;

        add(clickButton, gc);

    }

    public void activateComps() {
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "some mgs";
                String name = nameField.getText();
                String surname = surnameField.getText();
                String programming = buttonGroup.getSelection().getActionCommand();
                BottomPanelEvent bpe = new BottomPanelEvent(this, msg, name, surname, programming);
                bottomPanelListener.bottomPanelEventOccured(bpe);
                reserForm();
            }
        });
    }

    private void reserForm() {
        nameField.setText("");
        surnameField.setText("");
        nameField.requestFocus();
        buttonGroup.clearSelection();
    }


}
