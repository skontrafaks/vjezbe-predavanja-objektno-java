package vjezbe10.zadatak1;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextArea textField;
    private LeftPanel leftPanel;
    private LeftPanelListener leftPL;

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 500;

    public MainFrame() {
        super("Application with GUI");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        initComps();
        layoutComponents();
        activateFrame();
    }

    private void initComps() {
        leftPanel = new LeftPanel();
        textField = new JTextArea();
        textField.setPreferredSize(new Dimension(WIDTH - LeftPanel.WIDTH, HEIGHT));

    }

    private void layoutComponents() {
        MigLayout migLayout = new MigLayout();
        setLayout(migLayout);

        add(leftPanel, "west");
        add(textField);
    }

    private void activateFrame(){
        leftPL = new LeftPanelListener() {
            @Override
            public void setText(String txt) {
                String final_txt = txt + "\n*******************************\n";
                textField.append(final_txt);
            }

            @Override
            public void resetText() {
                textField.setText(null);
            }
        };
        leftPanel.setLeftPanelListener(leftPL);
    }
}
