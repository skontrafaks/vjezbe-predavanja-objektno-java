package gui_attempt_1;

import javax.swing.*;
import java.awt.*;

public class FrameGUI extends JFrame {

    private RightPanel rightPanel;
    private LeftPanel leftPanel;
    private AwesomePanel awesomePanel;
    private RightPanelListener rightPL;
    private AwesomePanelListener awesomePL;

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 800;

    public FrameGUI() {
        super("Test app");
        setSize(new Dimension(WIDTH, HEIGHT));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
        layoutComponents();
        activateApp();
        setVisible(true);
    }

    private void initComponents() {
        rightPanel = new RightPanel();
        leftPanel = new LeftPanel();
        awesomePanel = new AwesomePanel();

    }

    private void layoutComponents() {

        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setAlignment(FlowLayout.RIGHT);
        setLayout(flowLayout);
        add(leftPanel);
        add(awesomePanel);
        add(rightPanel);
    }

    private void activateApp() {
        rightPL = new RightPanelListener() {
            @Override
            public void addText(String txt) {
                leftPanel.addTextToTextField(txt);
            }

            @Override
            public void clearText() {
                leftPanel.clearTextFromTextField();
            }
        };
        rightPanel.setRightPanelListener(rightPL);

        awesomePL = new AwesomePanelListener() {
            @Override
            public void disableTextInput() {
                leftPanel.disableInputFromTextField();
            }
        };
        awesomePanel.setAwesomePanelListener(awesomePL);

    }
}
