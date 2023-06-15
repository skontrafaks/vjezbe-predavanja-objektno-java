package view;

import controller.AUXCLS;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllMailsFrame extends JFrame implements ActionListener {

    private JComboBox<String> mailsFor;
    private JTextArea mailsArea;
    private JScrollPane mailsScroll;
    private JButton closeButton;

    public AllMailsFrame(){

        setTitle("All mails");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        initComponents();
        layoutComponents();
        activateComponents();

    }

    private void initComponents(){

        mailsFor = new JComboBox<>();
        AUXCLS.addToComboBox(mailsFor);
        mailsFor.setSelectedIndex(-1);
        mailsArea = new JTextArea();
        mailsArea.setEditable(false);
        mailsScroll = new JScrollPane(mailsArea);
        mailsScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        closeButton = new JButton("Close");
    }

    private void layoutComponents(){
        setLayout(new MigLayout("center, insets 10 10 10 10, gapy 3%"));
        add(new JLabel("Mails for:"), "align right");
        add(mailsFor, "wrap");
        add(mailsScroll, "width 100%, height 60%, span, wrap");
        add(closeButton, "span 2, align center");
    }

    private void activateComponents(){

        mailsFor.addActionListener(this);
        closeButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (mailsFor.getSelectedItem() != null) {
            String userMail = mailsFor.getSelectedItem().toString();
            mailsArea.setText(AUXCLS.inbox.get(userMail));
        } else if (e.getSource() == closeButton) {
            dispose();
        }
    }
}
