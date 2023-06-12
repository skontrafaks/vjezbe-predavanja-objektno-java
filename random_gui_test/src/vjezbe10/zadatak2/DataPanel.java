package vjezbe10.zadatak2;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel {

    private JTextField payment; // field je single line text area
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public DataPanel() {

        setPreferredSize(new Dimension(MainFrame.WIDTH/2, MainFrame.HEIGHT));
        setFont(new Font("Arial", Font.PLAIN, 15));

        initComps();
        layoutComps();
    }

    private void initComps() {
        textArea = new JTextArea();
        Dimension textDim = getPreferredSize();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setFont(getFont());

        payment = new JTextField();
        payment.setEditable(false);
        Dimension dim = getPreferredSize();
        payment.setPreferredSize(new Dimension(dim.width, 30));

        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBar(null);
        scrollPane.setWheelScrollingEnabled(true);

    }

    private void layoutComps() {

        BorderLayout borderLayout = new BorderLayout();
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(payment, BorderLayout.SOUTH);

    }

    public void setData(String text) {
        textArea.append(text);
        textArea.append(("\n---------------------------------------------\n"));
    }

    public void setTotalPayment(String text) {
        payment.setText(text);
    }
}
