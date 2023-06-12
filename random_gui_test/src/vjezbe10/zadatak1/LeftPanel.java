package vjezbe10.zadatak1;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftPanel extends JPanel implements ActionListener {

    private JButton submitButton;
    private JButton resetButton;
    private JTextField textFieldPanel;
    private LeftPanelListener leftPanelListener;

    public static final int WIDTH = 300;

    public LeftPanel() {
        setPreferredSize(new Dimension(WIDTH, MainFrame.HEIGHT));
        setBorder(BorderFactory.createLineBorder(Color.WHITE));

        initComps();
        layoutComps();
        activateButtons();
    }

    public void setLeftPanelListener(LeftPanelListener leftPanelListener) {
        this.leftPanelListener = leftPanelListener;
    }

    private void initComps() {
        submitButton = new JButton("SUBMIT");
        resetButton = new JButton("RESET");
        textFieldPanel = new JTextField();
    }

    private void layoutComps() {
        MigLayout migLayout = new MigLayout();
        setLayout(migLayout);

        add(new Box(0), "wrap 200px");
        add(new JLabel("TEXT: "), "wrap");
        add(textFieldPanel, "width 10:100:200, wrap 100px");
        add(submitButton, "height ::100, wrap 50px");
        add(resetButton);
    }

    private void activateButtons() {
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            leftPanelListener.setText(textFieldPanel.getText());
        } else if (e.getSource() == resetButton) {
            leftPanelListener.resetText();
        }
    }
}
