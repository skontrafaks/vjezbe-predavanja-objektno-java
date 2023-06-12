package vjezbe10.zadatak2;

import com.sun.source.tree.NewArrayTree;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private DataPanel dataPanel;
    private FormPanel formPanel;
    private FormPanelListener formPanelListener;

    public static final int WIDTH = 650;
    public static final int HEIGHT = 400;

    public MainFrame() {
       super("Calculate your doom");
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComps();
        layoutComps();
        activateApp();

    }

    private void initComps() {
        dataPanel = new DataPanel();
        formPanel = new FormPanel();

    }

    private void layoutComps() {
        setLayout(new MigLayout("", "[grow]", "[]"));
        add(dataPanel, "dock east");
        add(formPanel, "dock west");
    }

    private void activateApp() {
        formPanelListener = new FormPanelListener() {
            @Override
            public void prikažiTekst(String tekst) {
                dataPanel.setData(tekst);
            }

            @Override
            public void izračunajKredit(String text) {
                dataPanel.setTotalPayment(text);
            }
        };
        formPanel.setFormPanelListener(formPanelListener);
    }
}
