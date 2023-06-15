package view;

import com.sun.source.tree.NewArrayTree;
import controller.MailBoxPanelListener;
import model.User;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private JMenuBar menuBar;
    private MailBoxPanel mailBoxPanel;
    CommunicationPanel communicationPanel;
    MailBoxPanelListener mailBoxPanelListener;

    public MainFrame() {
        super("Zadatak 6");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
        layoutComponents();
        activateComponents();
    }

    private void initComponents() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem);
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        mailBoxPanel = new MailBoxPanel();
        communicationPanel  = new CommunicationPanel();
    }

    private void layoutComponents() {
        setLayout(new MigLayout("insets 0 10 10 10"));
        add(menuBar, "wrap");
        add(new JSeparator(), "width 100%, span, wrap");
        add(mailBoxPanel, "width 40%, height 90%");
        add(communicationPanel, "width 40%, height 90%, align right");
    }

    private void activateComponents() {
        mailBoxPanelListener = new MailBoxPanelListener() {
            @Override
            public void addUserToMailbox(User user) {
                communicationPanel.updateMailBox(user);
            }
        };
        mailBoxPanel.setMailBoxPanelListener(mailBoxPanelListener);
    }
}
